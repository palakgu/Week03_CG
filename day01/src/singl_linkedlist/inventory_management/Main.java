package singl_linkedlist.inventory_management;

public class Main {
    public static void main(String[] args){
        InventoryLinkedList list = new InventoryLinkedList();
        list.addAtBeggining("Bottle", "123",12 , 250);
        list.addAtLast("Mug","124",7 , 290);
        list.addAtPos("Tiffin", "145" , 10 ,350 ,1);
        list.display();
         list.removeItem("124");
         list.display();
         list.updateQuantity("145" , 8);
         list.display();
         list.SearchItemID("123");
         list.SearchItemName("Mug");
         System.out.println(" Total value = "+ list.calculateValue());
         list.sortbyName();
         list.display();
         list.sortbyPrice();
         list.display();
    }
}
