package cse2010.hw3;

import java.util.Comparator;
import java.util.Objects;

/*
 * © 2024 CSE2010 HW #3
 *
 * You can freely modify this class except the signatures of the public methods!!
 */
public class DLinkedList<T> {
    private Node<T> header;
    private Node<T> trailer;
    private int size;

    public DLinkedList() {
        header = new Node<T>(null, null, null);
        trailer = new Node<T>(null, header, null);
        header.setNext(trailer);
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Add new node n at the front
    public void addFirst(Node<T> n) {
        addAfter(header, n);
    }

    // Add new node n at the rear
    public void addLast(Node<T> n) {
        addBefore(trailer, n);
    }

    // Remove a node at the front
    public void removeFirst() {
        if (isEmpty())
            return;
        remove(header.getNext());
    }

    // Remove a node at the front
    public void removeLast() {
        if (isEmpty())
            return;
        remove(trailer.getPrev());
    }

    // Add new node n before node p
    public void addBefore(Node<T> p, Node<T> n) {
        Objects.requireNonNull(p, "cannot not be null");
        Objects.requireNonNull(n, "cannot not be null");

       /*
            Complete the code here
        */
    }

    // Add new node n after node p
    public void addAfter(Node<T> p, Node<T> n) {
        Objects.requireNonNull(p, "cannot not be null");
        Objects.requireNonNull(n, "cannot not be null");

       /*
            Complete the code here
        */
    }

    // Remove a node p
    public void remove(Node<T> p) {
        if (p == null || p == header || p == trailer)
            return;

       /*
            Complete the code here
        */
    }

    public Node<T> getFirstNode() {
        if (isEmpty())
            return null;
        else
            return header.getNext();
    }

    /**
     * Returns next node if exists.
     *
     * @param cur current node
     * @return next node if exits, null otherwise
     */
    public Node<T> getNextNode(Node<T> cur) {
        Objects.requireNonNull(cur, "cannot not be null");

        if (cur.getNext() == trailer)
            return null;
        else
            return cur.getNext();
    }

    public Node<T> getLastNode() {
        if (isEmpty())
            return null;
        else
            return trailer.getPrev();
    }

    /**
     * Returns next node if exists.
     *
     * @param cur current node
     * @return previous node if exits, null otherwise
     */
    public Node<T> getPrevNode(Node<T> cur) {
        Objects.requireNonNull(cur, "cannot not be null");

        if (cur.getPrev() == header)
            return null;
        else
            return cur.getPrev();
    }

    /**
     * Find a node with an element with the value of "n".
     *
     * @param n          value of the element to search
     * @param comparator comparator
     * @return the node which has an element "n", or null if not found
     */
    public Node<T> find(T n, Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "cannot not be null");

        if (isEmpty()) return null;

        Node<T> current = getFirstNode();
        while (current != null) {
            if (comparator.compare(current.getInfo(), n) == 0) {
                break;
            }
            current = getNextNode(current);
        }
        return current;
    }
}

