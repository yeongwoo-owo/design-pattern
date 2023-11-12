package iterator.exercise.linkedlist;

public class Node<T> {
    private T content;
    private Node<T> next;

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> node) {
        this.next = node;
    }
}
