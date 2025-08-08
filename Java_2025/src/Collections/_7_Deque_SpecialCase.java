package Collections;
import java.util.ArrayDeque;
import java.util.Deque;

class InputRestrictedDeque<E> {
    private final Deque<E> deque = new ArrayDeque<>();

    public void insertRear(E item) {
        deque.addLast(item);  // Only insert at rear allowed
    }

    public E deleteFront() {
        return deque.removeFirst();  // Allowed
    }

    public E deleteRear() {
        return deque.removeLast();   // Allowed
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}

class OutputRestrictedDeque<E> {
    private final Deque<E> deque = new ArrayDeque<>();

    public void insertFront(E item) {
        deque.addFirst(item);  // Allowed
    }

    public void insertRear(E item) {
        deque.addLast(item);   // Allowed
    }

    public E deleteFront() {
        return deque.removeFirst(); // Only deletion allowed from front
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}



public class _7_Deque_SpecialCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InputRestrictedDeque<String> mesg = new InputRestrictedDeque<String>();
		mesg.insertRear("First transaction");;
		mesg.deleteFront();
		mesg.deleteRear();
		
		OutputRestrictedDeque<String> feedback = new OutputRestrictedDeque<String>();
		
		feedback.insertFront("Great product");
		feedback.insertRear("Great product");
		feedback.deleteFront();

	}

}
