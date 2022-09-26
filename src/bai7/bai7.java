package bai7;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhap 1 so tu 0-9 ");
        int so = sr.nextInt();
        switch (so){
            case 1:
                System.out.println("Day la so 1 ");
                break;
            case 2:
                System.out.println("Day la so 2 ");
                break;
            case 3:
                System.out.println("Day la so 3");
                break;
            case 4:
                System.out.println("Day la so 4");
                break;
            case 5:
                System.out.println("Day la so 5");
            case 6 :
                System.out.println("Day la so 6");
                break;
            case 7:
                System.out.println("Day la so 7");
            case 8:
                System.out.println("Day la so 8 ");
            case 9:
                System.out.println("Day la so 9 ");
            default:
                System.out.println("Khong hop le");
        }
    }
}
