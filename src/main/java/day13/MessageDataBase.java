package day13;

import java.util.*;

public class MessageDataBase {
    static List<Message> messages = new ArrayList<>();

    public static void showDialog(User u1, User u2) {   // должен вывести цепочку сообщений (диалог) пользователей u1 и u2
        for (Message mes : messages) {
            if (mes.getSender().equals(u1) && mes.getReceiver().equals(u2) || mes.getSender().equals(u2) && mes.getReceiver().equals(u1)) {
//                System.out.println(mes);
                System.out.println(mes.getSender() + " :" + mes.getText());
            }
        }
    }

    public static void addNewMessage(User u1, User u2, String text) {  //  “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text
        messages.add(new Message(u1, u2, text));
    }
}
