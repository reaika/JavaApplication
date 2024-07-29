package exe23;
import java.util.List;

public class Order {
    private List<Menu> menuList; // 注文したメニューのリスト
    private int tableNum;        // テーブル番号
    private int guestNum;        // ゲストの人数
    private boolean isPaid;      // 支払い済みかどうか

    // コンストラクタ
    public Order(List<Menu> menuList, int tableNum, int guestNum, boolean isPaid) {
        this.menuList = menuList;
        this.tableNum = tableNum;
        this.guestNum = guestNum;
        this.isPaid = isPaid;
    }

    // ゲッターとセッター
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public int getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(int guestNum) {
        this.guestNum = guestNum;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
