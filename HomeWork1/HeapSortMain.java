
import HomeWork1.Classes.ArrayCreator;
import HomeWork1.Classes.HeapSort;

import java.io.IOException;
import java.util.ArrayList;

public class HeapSortMain {
    public static void main(String[] args) throws IOException {

        ArrayCreator arrayCreator = new ArrayCreator();
        ArrayList<Integer> list = arrayCreator.createIntegerArrayList();
        HeapSort heapSort = new HeapSort();

        heapSort.printArray(list, "Массив до сортировки имеет вид: ");
        heapSort.sort(list);
        heapSort.printArray(list, "Массив после сортировки имеет вид: ");
    }
}
