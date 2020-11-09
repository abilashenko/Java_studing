package Lesson6.Task1;

public class LinkedClass<E> {
    private class Node {
        private Node next;
        private Node prev;
        private final E object;

        public Node(E object) {
            this.object = object;
            next = null;
            prev = null;
        }
    }

    private int counter = 0;
    private Node first = null;
    private Node last = null;

    public int size() {
        return counter;
    }

    public void add(E item) {
        if (first == null) {
            first = new Node(item);
            last = first;
        } else {
            Node newNode = new Node(item);
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        counter++;
    }

    public void remove(int index) {
        if (counter == 0) {
            return;
        }
        int listIndex = 0;
        Node element = first;
        while (element.next != null) {
            if (listIndex == index) {
                if (element == first) {
                    first = element.next;
                    first.prev = null;
                } else if (element == last) {
                    last = element.prev;
                    last.next = null;
                } else {
                    element.prev.next = element.next;
                    element.next.prev = element.prev;
                }
                counter--;
                break;
            } else {
                listIndex++;
                element = element.next;
            }
        }
    }

    public void remove(E item) {
        Node element = first;
        int index = 0;
        while (element.next != null) {
            if ((element.object != null) && (element.object.equals(item))) {
                remove(index);
                break;
            }
            index++;
            element = element.next;
        }
    }

    public E get(int index) {
        int indx = 0;
        Node element = first;
        while (element.next != null) {
            if (indx == index) {
                return element.object;
            } else {
                indx++;
                element = element.next;
            }
        }
        return null;
    }

    public void clear() {
        first = null;
        last = null;
        counter = 0;
    }

    @Override
    public String toString() {
        String list;
        if (counter == 0) {
            list = "{}";
        } else {
            list = "{";
            Node element = first;
            while (element.object != null) {
                list += element.object.toString() + ",";
                element = element.next;
                if (element == null) {
                    break;
                }
            }
            list += "}";
        }
        return list;
    }
}