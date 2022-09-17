// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.random.*;
import java.util.Scanner;

public final class Task01 {
    public static void main(String[] args) {
        System.out.println("Enter length:");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        ArrayList<Integer> arrayList = fillArray(length);
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                arrayList.remove(i);
            } else {
                i++;
            }
            System.out.println(arrayList);
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