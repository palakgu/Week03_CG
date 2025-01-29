package singl_linkedlist.social_media;

//package singly_linkedlist.socialmedia;

public class Main {
    public static void main(String[] args) {
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.addNode(1, "John", 25);
        socialMedia.addNode(2, "Alice", 30);
        socialMedia.addNode(3, "Bob", 20);
        socialMedia.addFriend(1, 2);
        socialMedia.addFriend(1, 3);
        socialMedia.addFriend(2, 3);
        socialMedia.displayFriends(1);
        socialMedia.findMutualFriends(1, 2);
        socialMedia.removeFriend(1, 2);
        socialMedia.displayFriends(1);
        socialMedia.searchUserByName("John");
        socialMedia.searchUserById(2);
        socialMedia.countFriends();
    }
}