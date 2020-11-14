package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        user1.sendMessage(user2, "hello");
        user2.sendMessage(user1, "how are you");
        user1.sendMessage(user2, "fine, thanks");
        user1.sendMessage(user3, "oh my god");
        user3.sendMessage(user1, "WTF?");
        user2.sendMessage(user3, "who are you");
        MessageDataBase.showDialog(user1, user2);
        MessageDataBase.showDialog(user1, user3);
        MessageDataBase.showDialog(user2, user3);
    }
}
