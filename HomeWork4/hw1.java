package HomeWork4;

import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.addLast(i);
        }
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println("\nПеревернутый список:");
        LinkedList<Integer> reversed = new LinkedList<>();
        for (Integer item : list) {
            reversed.addFirst(item);
        }
        for (Integer item : reversed) {
            System.out.print(item + " ");
        }
    }
}