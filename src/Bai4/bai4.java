package Bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        System.out.println("Nhập mã sinh vien :");
        String StudentID = sr.nextLine();

        System.out.println("Nhập tên sinh viên :");
        String StudentName = sr.nextLine();

        System.out.println("Nhập tuổi sinh viên :");
        int age = Integer.parseInt(sr.nextLine());

        System.out.println("Nhập vào giới tính :  ");
        boolean Gender = Boolean.parseBoolean(sr.nextLine());

        System.out.println("Nhập vào email :");
        String email = sr.nextLine();

        System.out.println("Nhập vào số điện thoại :");
        int phone = Integer.parseInt(sr.nextLine());

        System.out.println("Nhập vào địa chỉ :");
        String address = sr.nextLine();
        System.out.printf("*************STUDEN INFORMATION**************");
        System.out.printf("StudentID : %15S, Studentname : %10s , age : %6d \n ", StudentID,StudentName,age );
        System.out.printf("gender : %15b, email : %10s , Phone : %6s \n ",Gender, email,phone);
        System.out.printf("address : %s" , address);

    }
}
