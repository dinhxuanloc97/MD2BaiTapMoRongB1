package bai5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a :");
        float a = sr.nextFloat();
        System.out.println("Nhập vao cạnh b :");
        float b = sr.nextFloat();
        System.out.println("Nhập vào cạnh c ");
        float c = sr.nextFloat();
        if ((a + b > c) || (a + c > b) || (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều!");

            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");

            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                System.out.println("Tam giác vuông!");

            } else if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");

            } else {
                System.out.println("Tam giác thường!");

            }
        } else {
            System.out.println("đây k phải tam giác");

        }
    }
}
