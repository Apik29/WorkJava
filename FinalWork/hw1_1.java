package FinalWork;

import java.util.*;

public class hw1_1 {
    public static void main(String[] args) {

        Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Сиреневый");
        Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");
        System.out.println(l1.toString());

        System.out.println("Выберите функционал:");
        System.out.println("1 - Отсортировать по RAM");
        System.out.println("2 - Отсортировать по SSD");
        System.out.println("3 - Отсортировать по OS");
        Scanner sc = new Scanner(System.in, "ibm866");
        Integer choice = sc.nextInt();
        if (choice == 1) {

            System.out.printf("Сколько бы вы хотели оперативной памяти? 2, 4, 16, 32: ");
            Integer ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (ram < 32) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            } else if (ram < 16) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ram < 4) {
                System.out.printf(l1.toString());
            } else
                System.out.println("К сожалению такого товара нет в наличии!");

        } else if (choice == 2) {

            System.out.printf("Сколько бы вы хотели иметь памяти на ноутбуке?: 128, 256, 512  ");
            Integer ssd = sc.nextInt();
            if (ssd >= 512) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (ssd < 512) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            } else if (ssd < 256) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ssd < 128) {
                System.out.printf(l1.toString());
            } else
                System.out.println("К сожалению такого товара нет в наличии!");

        } else if (choice == 3) {

            System.out.println("Какую операционную систему предпочитаете? Windows 10 , Windows 11");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equals("Windows")) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (os.equals("Windows 10")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            } else if (os.equals("Windows 11")) {
                System.out.printf(l2.toString() + "\n" + l4.toString());
            } else
                System.out.println("К сожалению такого товара нет в наличии!");
            sc1.close();
        }

        sc.close();
    }

}