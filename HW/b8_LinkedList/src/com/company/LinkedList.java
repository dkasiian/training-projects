package com.company;

import java.util.*;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     *  Inserts a new node at the beginning of this list.
     */
    public void addFirst(T item) {
        head = new Node<>(item, head);
    }

    /**
     *  Returns the first element in the list.
     */
    public T getFirst() {
        if(head == null)
            throw new NoSuchElementException();

        return head.data;
    }

    /**
     *  Removes the first element in the list.
     */
    public T removeFirst() {
        T tmp = getFirst();
        head = head.next;
        return tmp;
    }

    /**
     *  Inserts a new node to the end of this list.
     */
    public void addLast(T item) {
        if (head == null)
            addFirst(item);
        else {
            Node<T> tmp = head;
            while(tmp.next != null)
                tmp = tmp.next;

            tmp.next = new Node<>(item, null);
        }
    }

    /**
     *  Returns the last element in the list.
     */
    public T getLast() {
        if(head == null)
            throw new NoSuchElementException();

        Node<T> tmp = head;
        while(tmp.next != null)
            tmp = tmp.next;

        return tmp.data;
    }

    /**
     *  Removes all nodes from the list.
     */
    public void clear() {
        head = null;
    }

    /**
     *  Returns true if this list contains the specified element.
     */
    public boolean contains(T x) {
        for(T tmp : this)
            if(tmp.equals(x))
                return true;

        return false;
    }

    /**
     *  Returns the data at the specified position in the list.
     */
    public T get(int pos) {
        if (head == null)
            throw new IndexOutOfBoundsException();

        Node<T> tmp = head;
        for (int k = 0; k < pos; k++)
            tmp = tmp.next;

        if(tmp == null)
            throw new IndexOutOfBoundsException();

        return tmp.data;
    }

    /**
     *  Inserts a new node after a node containing the key.
     */
    public void insertAfter(T key, T toInsert) {
        Node<T> tmp = head;

        while(tmp != null && !tmp.data.equals(key))
            tmp = tmp.next;

        if(tmp != null)
            tmp.next = new Node<>(toInsert, tmp.next);
    }

    /**
     *  Inserts a new node before a node containing the key.
     */
    public void insertBefore(T key, T toInsert) {
        if(head == null)
            return;

        if(head.data.equals(key)) {
            addFirst(toInsert);
            return;
        }

        Node<T> prev = null;
        Node<T> cur = head;

        while(cur != null && !cur.data.equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        //insert between cur and prev
        if(cur != null)
            prev.next = new Node<>(toInsert, cur);
    }

    /**
     *  Removes the first occurrence of the specified element in this list.
     */
    public void remove(T key) {
        if(head == null)
            throw new RuntimeException("cannot delete");

        if(head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> cur  = head;
        Node<T> prev = null;

        while(cur != null && !cur.data.equals(key) ) {
            prev = cur;
            cur = cur.next;
        }

        if(cur == null)
            throw new RuntimeException("cannot delete");

        //delete cur node
        prev.next = cur.next;
    }

    /**
     *  Returns a string representation
     */
    public String toString() {
        StringBuffer result = new StringBuffer();
        for(Object x : this)
            result.append(x + " ");

        return result.toString();
    }

    public Iterator<T> iterator()
    {
        return new LinkedListIterator(head);
    }
}