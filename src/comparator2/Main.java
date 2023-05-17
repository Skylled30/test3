package comparator2;

import comparator2.Message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Message> messages = new ArrayList<>();
        messages.add(new Message(150, "Hello, World!", "text"));
        messages.add(new Message(150, "Hello, Sun!", "text"));
        messages.add(new Message(150,  "Hello, friend!", "pic"));
        messages.add(new Message(150, "Hello, dude!", "pic"));
        messages.sort(new MessageIdComparator().thenComparing(new MessageTypeComparator()));
        System.out.println(messages);
    }
}
