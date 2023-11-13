package Java.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    //등록 - Observer 등록
    public void register(String group, Subscriber subscriber) {
        if(subscribers.containsKey(group)) {
            subscribers.get(group).add(subscriber);
            return;
        }
        List<Subscriber> list = new ArrayList<>();
        list.add(subscriber);
        this.subscribers.put(group, list);
    }

    // 햐지
    public void unregister(String subject, Subscriber subscriber) {
        if(subscribers.containsKey(subject)) {
            subscribers.get(subject).remove(subscriber);
        }
    }

    // 이벤트 발생
    public void sendMessage(User user, String group, String message) {
        String userMessage = "보내는사람 (" + user.getName() + ") : " + message;

        // observer list에 등록된 각각의 observer들의 notify 실행
        if(subscribers.containsKey(group)) {
            System.out.println("======= 단톡방 : " + group + " =======");
            this.subscribers.get(group).forEach(s -> s.notifyHandleMessage(userMessage));
        }
    }
}