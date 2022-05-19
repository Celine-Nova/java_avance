package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrdersSeed {
    public static ArrayList<Order> InsertOrders(ResultSet resultSet) throws SQLException {
        var orders = new ArrayList<Order>();


        while (resultSet.next()) {
            Order order = new Order(
                    resultSet.getInt("id"),
                    resultSet.getString("typePresta"),
                    resultSet.getString("designation"),
                    resultSet.getInt("nbDays"),
                    resultSet.getInt("unitPrice")
                    );

            orders.add(order);
        }
        return orders;
    }
}
