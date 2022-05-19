package jdbc;

import java.util.ArrayList;

public class ShowArray {
    public static void showArray(ArrayList <Order> orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
    public static void showArrayClients(ArrayList <Clients> clients) {
        for (Clients client : clients) {
            System.out.println(client);
        }
    }
}
