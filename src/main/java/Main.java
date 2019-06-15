import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> stringDeque = new LinkedList<String>();
        stringDeque.add("James");
        stringDeque.addFirst("Aaron");
        stringDeque.addLast("Jennifer");
        stringDeque.offerFirst("John");
        stringDeque.offerLast("Kent");

        System.out.println(stringDeque);

        stringDeque.pollFirst();
        System.out.println(stringDeque);

        stringDeque.pollLast();
        System.out.println(stringDeque);

        stringDeque.removeFirst();
        System.out.println(stringDeque);
        stringDeque.removeLast();
        System.out.println(stringDeque);

        stringDeque.addFirst("Aaron");
        stringDeque.addLast("Jennifer");
        stringDeque.offerFirst("John");
        stringDeque.offerLast("Kent");

        System.out.println(stringDeque.getFirst());
        System.out.println(stringDeque.getLast());
        System.out.println(stringDeque.peekFirst());
        System.out.println(stringDeque.peekLast());
        System.out.println(stringDeque.peek());

    }
}
