package comparator2;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Message  {
    private String message;
    private int id;
    private String type;

    public Message(int id, String message, String type) {
        this.message = message;
        this.type = type;
        this.id =  id;
    }
    public String getMessage() {
        return message;
    }
    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return "[" + id + "] " + type + " " + message;
    }
}

