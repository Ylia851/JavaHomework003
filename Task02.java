//Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.random.*;
import java.util.Scanner;

public final class Task02 {
    public static void main(String[] args) {
        System.out.println("Enter length:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        ArrayList<Integer> arrayList = fillArray(length);
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        int summ = arrayList.get(0);
        for (int i = 0; i < length; i++) {
            summ += arrayList.get(i);
        }
        double sred = summ / length;
        System.out.println(sred);
        for (int j = 0; j < length; j++) {
            if (arrayList.get(j) < min) {
                min = arrayList.get(j);
            }
            if (arrayList.get(j) > max) {
                max = arrayList.get(j);
            }
            System.out.println(min);
            System.out.println(max);
        }

    }

    private static ArrayList<Integer> fillArray(int length) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arrayList.add(rnd.nextInt());
        }
        return arrayList;
    }

}