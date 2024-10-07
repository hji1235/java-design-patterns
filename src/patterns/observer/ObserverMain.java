package patterns.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Topic topic = new Topic();
        topic.register(new TopicSubscriber("A", topic));
        topic.register(new TopicSubscriber("B", topic));
        topic.register(new TopicSubscriber("C", topic));

        topic.postMessage("깜짝 이벤트가 발행되었습니다."); // 메시지 발행 및 옵저버들에게 전파
    }
}
