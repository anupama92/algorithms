import java.util.LinkedList;

/**
 * Created by arao10 on 1/23/18.
 */
public class Queue<Integer> {

    private LinkedList<Integer> list = new LinkedList<Integer>();



    public void enqueue(Integer item) {
        list.addLast(item);
    }
    public Integer dequeue() {
        return list.poll();
    }
    public boolean hasItems() {
        return !list.isEmpty();
    }
    public int size() {
        return list.size();
    }
    public void addItems(Queue<? extends Integer> q) {
        while (q.hasItems()) list.addLast(q.dequeue());
    }
}
