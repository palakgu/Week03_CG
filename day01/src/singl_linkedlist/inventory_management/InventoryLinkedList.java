package singl_linkedlist.inventory_management;

import java.sql.SQLOutput;

public class InventoryLinkedList {
 private Inventory head ;

 public void addAtBeggining(String itemName , String itemID , int quantity , double price){
     Inventory newInventory = new Inventory(itemName, itemID, quantity, price);
    newInventory.next = head ;
    head = newInventory;
 }
 public void addAtLast(String itemName , String itemID , int quantity , double price){
     Inventory newInventory = new Inventory(itemName, itemID, quantity, price);
     if(head == null){
         head = newInventory;
     } else {
         Inventory temp = head ;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newInventory;
     }
 }
 public void addAtPos(String itemName , String itemID , int quantity , double price , int pos){
     Inventory newInventory = new Inventory(itemName, itemID, quantity, price);
     if(pos == 0){
         newInventory.next = head ;
         head = newInventory;
     }
     else {
         Inventory temp = head ;
         for(int i=0 ;i<pos-1 && temp.next != null ; i++){
             temp = temp.next;
         }
         if(temp!= null){
             newInventory.next = temp.next;
             temp.next = newInventory;
         }
         else {
             System.out.println(" the position is out of range ");
         }
     }
 }
 public void removeItem(String itemID){

     if(head == null){
         System.out.println("list is empty");
     }
     if(head.itemID == itemID){
         head = head.next;
         return;
     }
     Inventory temp = head ;
     while( temp!= null && temp.next.itemID != itemID){
         temp = temp.next;
     }
     if(temp.next== null){
         System.out.println(" The item is not found");
     }
     else {
         temp.next = temp.next.next;
     }
 }
 public void updateQuantity(String itemID , int quantity){
 Inventory temp = head ;
 while(temp != null ){
     if(temp.itemID == itemID){
         temp.quantity = quantity;
     }
     temp = temp.next;
 }
 }
 public void SearchItemID(String itemID){
     Inventory temp = head ;
     while(temp!= null){
         if(temp.itemID == itemID){
             System.out.println("item Name is "+ temp.itemName);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }
 public void SearchItemName(String itemName){
     Inventory temp = head ;
     while(temp!=null){
         if(temp.itemName.equals(itemName)){
             System.out.println(" Item Name is "+ temp.itemName);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not Found");
 }
 public double calculateValue(){
     Inventory temp = head;
     double totalvalue =0;
     while(temp!=null){
         totalvalue = temp.price *temp.quantity;
         temp = temp.next;
     }
     return totalvalue;
 }
 public void sortbyName(){
     Inventory temp = head ;
     while(temp!= null){
         Inventory innerTemp = temp.next;
         while(innerTemp!=null){
             if(temp.itemName.compareTo(innerTemp.itemName)>0){
                 String ItemName = temp.itemName;
                 String ItemID = temp.itemID;
                 int Quantity = temp.quantity;
                 double Price = temp.price ;

                 temp.itemName = innerTemp.itemName;
                 temp.itemID = innerTemp.itemID;
                 temp.quantity = innerTemp.quantity;
                 temp.price = innerTemp.price;

                 innerTemp.itemName = ItemName;
                 innerTemp.itemID = ItemID;
                 innerTemp.quantity = Quantity;
                 innerTemp.price = Price;

             }
             innerTemp = innerTemp.next;

         }
         temp = temp.next;
     }
 }
 public void sortbyPrice(){
     Inventory temp = head ;
     while(temp!=null){
         Inventory innerTemp = temp.next;
         while(innerTemp!=null){
             if(innerTemp.price>temp.price){
                 String ItemName = temp.itemName;
                 String ItemID = temp.itemID;
                 int Quantity = temp.quantity;
                 double Price = temp.price ;

                 temp.itemName = innerTemp.itemName;
                 temp.itemID = innerTemp.itemID;
                 temp.quantity = innerTemp.quantity;
                 temp.price = innerTemp.price;

                 innerTemp.itemName = ItemName;
                 innerTemp.itemID = ItemID;
                 innerTemp.quantity = Quantity;
                 innerTemp.price = Price;
             }
             innerTemp= innerTemp.next;
         }
         temp = temp.next;
     }
 }
 public void display(){
     Inventory temp = head;
     while(temp != null){
         System.out.println("Item name = "+ temp.itemName + " Item id = "+ temp.itemID +" item price = "+ temp.price + "item Quantity = "+ temp.quantity);
         temp = temp.next;
     }
 }
}
