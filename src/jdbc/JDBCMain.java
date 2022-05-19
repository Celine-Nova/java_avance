package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCMain {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Connection BDD
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("connexion établie avec succès");
            //Crée un objet SQLServerStatement pour l'envoi d'instructions SQL à la base de données
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");

            try {
                ArrayList<Order> orders = OrdersSeed.InsertOrders(resultSet);
                ShowArray.showArray(orders);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
//

        } catch (SQLException e) {
            {
                System.out.println("echec connexion bdd");
                System.out.println(e.getMessage());
            }
        }
    }
}




