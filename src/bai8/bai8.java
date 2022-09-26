package bai8;


import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào 3 chu so  ");
        int num = sr.nextInt();
        int a = num /100;
        num = num %100;
        int b = num /10;
        int c = num % 10;
        System.out.println( "giá trị đảo ngược : "+ c + b + a);
    }
}
