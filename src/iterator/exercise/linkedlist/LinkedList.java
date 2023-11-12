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

    public void insert(Node<T> node) {
        tail.setNext(node);
        tail = node;
    }
}
