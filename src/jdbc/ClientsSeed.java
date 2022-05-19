package jdbc;

import jdbc.Clients;
import jdbc.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClientsSeed {
    public static ArrayList<Clients> getClients(ResultSet resultSet) throws SQLException {
        var clients = new ArrayList<Clients>();

        while (resultSet.next()) {
            Clients client = new Clients(
                    resultSet.getInt("id"),
                    resultSet.getString("companyName"),
                    resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("email"),
                    resultSet.getString("phone"),
                    resultSet.getString("address"),
                    resultSet.getInt("zipCode"),
                    resultSet.getString("city"),
                    resultSet.getString("country"),
                    resultSet.getByte("state"));

            clients.add(client);
        }
        return clients;
    }
}
