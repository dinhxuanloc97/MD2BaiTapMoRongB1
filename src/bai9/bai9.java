package bai9;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào số sencods :");
        int num = sr.nextInt();
        int a = num / 3600;
        int b = (num % 3600) / 60;
        int c = (num % 3600) % 60;
        System.out.printf("hous : %d , minutes : %d, seconds :%d ," ,a,b,c) ;
    }
}
