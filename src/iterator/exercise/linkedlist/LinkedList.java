package iterator.exercise.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = new Node<>(null);
        tail = head;
    }

    public Node<T> getHead() {
        return head;
    }

    public void insert(T content) {
        Node<T> node = new Node<>(content);
        tail.setNext(node);
        tail = node;
    }
}
