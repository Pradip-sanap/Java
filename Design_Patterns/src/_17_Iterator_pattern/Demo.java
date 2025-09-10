package _17_Iterator_pattern;

import java.util.Collection;
import java.util.Iterator;

interface IteratorCustom<T> {
    boolean hasNext();
    T next();
}

interface Container<T> {
    IteratorCustom<T> iterator();
}

class NameCollection implements Container<String> {
    private String[] names = {"Alice", "Bob", "Charlie", "Diana"};

    @Override
    public IteratorCustom<String> iterator() {
        return new NameIterator();
    }

    // Step 4: Concrete Iterator
    private class NameIterator implements IteratorCustom<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
public class Demo {

	public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        IteratorCustom<String> iterator = nameCollection.iterator();

        System.out.println("Traversing names using custom iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
        Iterator<Integer> it;
        Collection<String> c;
        
    }

}
