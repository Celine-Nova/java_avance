package jdbc;

import java.sql.*;
import java.util.ArrayList;

public class ClientsQueries {

    //Methodes des requetes
    public static ResultSet querieSelect( Statement statement) {

        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery("SELECT * FROM clients");

        } catch (SQLException e) {
            System.out.println("c'est rapé");
        }
        return  resultSet;
    }

    public static ResultSet clientById(Statement statement, int id) {
        ResultSet resultSet = null;

        try {
            resultSet = statement.executeQuery("SELECT * FROM clients WHERE id =" + id);

        } catch (SQLException e) {
            System.out.println("c'est rapé");
        }
        return resultSet;
    }

    public static void deleteClientById(Statement statement, int id) {
        try {
            statement.executeUpdate("DELETE FROM clients WHERE id =" + id);

        } catch (SQLException e) {
            System.out.println("c'est rapé");
        }
        System.out.println("Vous avez bien supprimé le gros c..");
    }

    public static String updateClientById(Statement statement, Clients client) {
        try {
            //UPDATE `clients` SET `id`=[value-1],`companyName`=[value-2],`firstName`=[value-3],`lastName`=[value-4],
            // `email`=[value-5],`phone`=[value-6],`address`=[value-7],`zipCode`=[value-8],`city`=[value-9],`country`=[value-10],`state`=[value-11] WHERE 1
            statement.executeUpdate("UPDATE clients SET id = " + client.getId() + " compagnyName = " + client.getCompanyName() +
                    "firstName = " + client.getFirstName() + " lastName = " + client.getLastName() + " email =  " +
                    client.getEmail() + " phone = " + client.getPhone() + " addresse " + client.getAddresse() +
                    " zipCode = " + client.getZicCopde() + " city = " + client.getCity() + " Country = " +
                    client.getCountry() + " State = " + client.getState() + " WHERE " + 5);

        } catch (SQLException e) {
            System.out.println("c'est rapé");
        }
        return "Vous avez modifié le client";
    }
}
