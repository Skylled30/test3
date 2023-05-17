package comparator2;

import java.util.Comparator;

public class MessageIdComparator implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
