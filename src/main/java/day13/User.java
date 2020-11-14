package day13;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List <User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe (User user) {
        this.subscriptions.add(user);               //подписывает пользователя на пользователя user
    }

    public boolean isSubscribed(User user) {        //возвращает True, если пользователь подписан на пользователя user
        if (subscriptions.indexOf(user) > 0) {
            return true;
        } return false;
    }
    public boolean isFriend(User user) {            //возвращает True, если пользователь user является другом
        if (subscriptions.indexOf(user) > 0 && user.subscriptions.indexOf(this.getUsername()) > 0 ) {
            return true;
        } return false;
    }
    public void sendMessage (User user, String text) {       //отправляет сообщение с текстом text пользователю user
        MessageDataBase.addNewMessage(this, user, text);
    }
    public String toString() {          //возвращает строковое представление пользователя (имя пользователя)
        return username;
    }
}
