package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class ClientsMain {
    public static void main(String[] args) {
        Connection connection = null;

        // Connexion Bdd
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("connexion établie avec succès");
            Statement statement = connection.createStatement();

            try {
                ArrayList<Clients> clients = ClientsSeed.getClients(ClientsQueries.querieSelect(statement));
                ShowArray.showArrayClients(clients);
                System.out.println("=======================================================");

                ArrayList<Clients> clientById = ClientsSeed.getClients(ClientsQueries.clientById(statement,1));
                ShowArray.showArrayClients(clientById);
                System.out.println("=======================================================");

                ClientsQueries.deleteClientById(statement,5);

                System.out.println("=======================================================");



            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (SQLException e) {
            {
                System.out.println("echec connexion bdd");
                System.out.println(e.getMessage());
            }
        }
    }
}