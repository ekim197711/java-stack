import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class FootballStackDemo {
    public static void main(String[] args) {
        Stack<String> myfootballstack = new Stack<>();
        myfootballstack.push("Football 1");
        myfootballstack.push("Football 2");
        myfootballstack.push("Football 3");
        myfootballstack.push("Football 4");
        myfootballstack.pop();
        Iterator<String> iterator = myfootballstack.iterator();
        for (String football : myfootballstack) {
            System.out.println(football);
        }

        System.out.println(myfootballstack.peek());
        int search = myfootballstack.search("Football 2");
        System.out.println(search);

        ListIterator<String> stringListIterator = myfootballstack.listIterator(myfootballstack.size());
        while (stringListIterator.hasPrevious()){
            String previous = stringListIterator.previous();
            System.out.println(previous);
        }

    }
}
