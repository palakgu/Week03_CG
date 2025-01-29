package singl_linkedlist.inventory_management;

public class Inventory {
    String itemName ;
    String itemID ;
    int quantity ;
    double price ;
    Inventory next ;
    Inventory(String itemName , String itemID , int quantity , double price ){
        this.itemName = itemName ;
        this.itemID = itemID ;
        this.quantity = quantity;
        this.price = price;
        this.next  = null ;
    }
}
