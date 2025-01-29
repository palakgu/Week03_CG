package singl_linkedlist.social_media;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int userId;
    String name;
    int age;
    int [] friendIds;
    Node next;

    Node(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        this.next=null;
        this.friendIds=new int[0];
    }
}