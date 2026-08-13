// import java.util.*;
class DynamicArray {
    int [] array;
    int size;
    public DynamicArray(int capacity) {
        array = new int[capacity];
        size=0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;

    }

    public void pushback(int n) {
        if(size == array.length){
            resize();
        }
        array[size]= n;
        size++;
    }

    public int popback() {
        int n = array[size - 1];
        size--;
        return n;
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length * 2);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}
