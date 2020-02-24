package LinkedList;

public class NewLinkedList {
    Person person;
    private Node first;
    private Node last;

    public void addLast(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;

        }


    }

    public boolean isEmpty() {
    }

    public void display() {
    }

    public void displayOne() {
    }

    public void deleteNode(int choice) {
    }

    public boolean indexOf(String firstName) {
    }

    public void getNode(boolean indexOf) {
    }
