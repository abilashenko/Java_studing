package Lesson6.Task1;

import java.util.Arrays;

public class ArrayClass<E> {
    private E[] array = (E[]) new Object[20];
    private int counter = 0;

    public int size() {
        return counter;
    }

    public void add(E item) {
        if ((counter > 0) && (counter % 20 == 0)) {
            E[] newarray = Arrays.copyOf(array, array.length + 20);
            newarray[counter] = item;
            array = newarray;
        } else {
            array[counter] = item;
        }
        counter++;
    }

    public void remove(int index) {
        array[index] = null;
        for (int i = index + 1; i < array.length - 1; i++) {
            array[i - 1] = array[i];
            array[i] = null;
        }
        counter--;
    }

    public void remove(E item) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != null) && (array[i].equals(item))) {
                remove(i);
            }
        }
    }

    public E get(int index) {
        return array[index];
    }

    public void clear() {
        array = null;
        counter = 0;
    }

    @Override
    public String toString() {
        String arr = "{";
        for (int i = 0; i < counter; i++) {
            if (array[i] != null) {
                arr += array[i].toString() + ",";
            }
        }
        arr += "}";
        return arr;
    }
}
