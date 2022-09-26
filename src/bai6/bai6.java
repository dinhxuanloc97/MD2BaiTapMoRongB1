package bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập vào tháng ");
        int month = sr.nextInt();
        System.out.println("Nhập vào năm ");
        int year = sr.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year %100==0){
                if (year % 400 ==0){
                    isLeapYear=true;
                }
            }else {
                isLeapYear=true;
            }
        }
        if (isLeapYear){
            System.out.println(" la nam nhuan ");
        }else {
            System.out.println(" k phai nhuan" );
        }
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Day la thang co 31 ngay ");
                break;
            case 4:
            case 6:
            case 9 :
            case 11 :
                System.out.println("Day la thang co 30 ngay ");
                break;
            case 2: if (isLeapYear){
                System.out.println("the month"+month+" 29 days");
                break;
            }else {
                System.out.println("Tháng 2 có 28 ngày");
                break;
            }

            default:
                System.out.println("Khong hop le");
        }
    }
}
