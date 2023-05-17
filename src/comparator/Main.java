package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        messages.add(new Message("Hello, friend!"));
        Comparator<Message> comparator = Comparator.comparing(Message::getId);
        Collections.sort(messages);
        System.out.println(messages);

    }
}
