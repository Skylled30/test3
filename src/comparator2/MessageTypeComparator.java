package comparator2;

import java.util.Comparator;

public class MessageTypeComparator implements Comparator<Message> {
    @Override
    public int compare(Message o1, Message o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
