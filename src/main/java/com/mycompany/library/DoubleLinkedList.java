package com.mycompany.library;

public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    // Setters and getters
    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    public void remove(Node<T> node) {
        if (node == null) {
            return;
        }

        if (node == head) {
            head = node.getNext();
        }

        if (node == tail) {
            tail = node.getPrevious();
        }

        if (node.getPrevious() != null) {
            node.getPrevious().setNext(node.getNext());
        }

        if (node.getNext() != null) {
            node.getNext().setPrevious(node.getPrevious());
        }

        size--;
    }

    public Node<T> getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node<T> current = head;
        int count = 0;
        while (count < index) {
            current = current.getNext();
            count++;
        }

        return current;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.getData().toString());
            current = current.getNext();
        }
    }
}
