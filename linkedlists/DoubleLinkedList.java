public class DoubleLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

   
    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T data = current.data;
            current = current.next; 
            return data;
        }
    }

    public static void main(String[] args) {
        
        final DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.add("Strawberry");
        list.add("Milkshake");
        list.add("Fries");

        
        System.out.println("List items:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}