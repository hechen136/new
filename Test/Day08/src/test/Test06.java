package test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(", ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].toCharArray().length < 5) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
