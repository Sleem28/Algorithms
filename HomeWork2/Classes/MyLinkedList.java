package HomeWork2.Classes;

import HomeWork2.Interfaces.IAdd;
import HomeWork2.Interfaces.IDelete;
import HomeWork2.Interfaces.IRevert;

import java.util.Iterator;

public class MyLinkedList<T> implements IAdd, IDelete, IRevert, Iterable {
    Node head;
    Node tail;
    @Override
    public void add(Object item) {
        Node node = new Node();
        node.value = item;
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    @Override
    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if(previous == null){
            next.previous = null;
            head = next;
        }else{
            if(next == null){
                previous.next = null;
                tail = previous;
            }else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    @Override
    public void revert() {
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if(previous == null)
                tail = currentNode;
            if(next == null)
                head = currentNode;
            currentNode = next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private Node currentNode = head;

            @Override
            public boolean hasNext() {
                return (currentNode != null)? true : false;
            }

            @Override
            public T next() {
                T value = (T) currentNode.value;
                Node nextNode = currentNode.next;
                currentNode = nextNode;
                return value;
            }
        };
        return iterator;
    }
}
