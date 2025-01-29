package singl_linkedlist.social_media;

//package singly_linkedlist.socialmedia;

public class SocialMedia {
    Node head;
    public void addNode(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFriend(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds = addFriendId(user1.friendIds, userId2);
            user2.friendIds = addFriendId(user2.friendIds, userId1);
        }
    }

    public void removeFriend(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds = removeFriendId(user1.friendIds, userId2);
            user2.friendIds = removeFriendId(user2.friendIds, userId1);
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        Node user1 = findUserById(userId1);
        Node user2 = findUserById(userId2);
        if (user1 != null && user2 != null) {
            int[] mutualFriends = findMutualFriendIds(user1.friendIds, user2.friendIds);
            for (int friendId : mutualFriends) {
                System.out.println("Mutual Friend ID: " + friendId);
            }
        }
    }

    public void displayFriends(int userId) {
        Node user = findUserById(userId);
        if (user != null) {
            for (int friendId : user.friendIds) {
                System.out.println("Friend ID: " + friendId);
            }
        }
    }

    public void searchUserByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    public void searchUserById(int userId) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    public void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Number of Friends: " + temp.friendIds.length);
            temp = temp.next;
        }
    }

    private Node findUserById(int userId) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    private int[] addFriendId(int[] friendIds, int newFriendId) {
        int[] newFriendIds = new int[friendIds.length + 1];
        System.arraycopy(friendIds, 0, newFriendIds, 0, friendIds.length);
        newFriendIds[friendIds.length] = newFriendId;
        return newFriendIds;
    }

    private int[] removeFriendId(int[] friendIds, int friendIdToRemove) {
        int[] newFriendIds = new int[friendIds.length - 1];
        int index = 0;
        for (int friendId : friendIds) {
            if (friendId != friendIdToRemove) {
                newFriendIds[index++] = friendId;
            }
        }
        return newFriendIds;
    }

    private int[] findMutualFriendIds(int[] friendIds1, int[] friendIds2) {
        int[] mutualFriendIds = new int[friendIds1.length];
        int index = 0;
        for (int friendId1 : friendIds1) {
            for (int friendId2 : friendIds2) {
                if (friendId1 == friendId2) {
                    mutualFriendIds[index++] = friendId1;
                }
            }
        }
        return mutualFriendIds;
    }
}