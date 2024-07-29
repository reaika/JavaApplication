package exe23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // メニューのインスタンスを作成
        Menu menu1 = new Menu();
        menu1.price = 1000;
        menu1.name = "Pasta";

        Menu menu2 = new Menu();
        menu2.price = 1500;
        menu2.name = "Steak";

        // メニューリストを作成
        List<Menu> menuList = new ArrayList<>();
        menuList.add(menu1);
        menuList.add(menu2);

        // 注文のインスタンスを作成
        Order order = new Order(menuList, 1, 3, false);

        // 注文情報を表示
        System.out.println("Table Number: " + order.getTableNum());
        System.out.println("Guest Number: " + order.getGuestNum());
        System.out.println("Is Paid: " + order.isPaid());

        for (Menu menu : order.getMenuList()) {
            System.out.println("Menu Item: " + menu.name + ", Price: " + menu.price);
        }

        // 支払い済みに設定
        order.setPaid(true);
        System.out.println("Is Paid (after update): " + order.isPaid());
    }
}
