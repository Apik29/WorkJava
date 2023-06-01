// удаление четных чисел
package homeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка целых чисел: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int N = iScanner.nextInt();
            ArrayList<Integer> ev = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < N; i++) {
                int x = ran.nextInt(N);
                ev.add(x);
            }
            System.out.println(ev);

            for (int i = ev.size() - 1; i >= 0; i--) {
                int even = ev.get(i) % 2;
                if (even == 0) {
                    ev.remove(i);
                }
            }
            Collections.sort(ev);
            System.out.println(ev);
        }
    }
}