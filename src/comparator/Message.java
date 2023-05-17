package comparator;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Message implements Comparable<Message> {
    private String message;
    private int id;

    public Message(String message) {
        this.message = message;
        this.id = new Random().nextInt(1000);
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "[" + id + "] " + message;
    }

    @Override
    public int compareTo(@NotNull Message o) {
        return this.getId().compareTo(o.getId());
    }
}
