package Bai1_2_3;

import java.util.Scanner;

public class chuvidientich {
    public static void main(String[] args) {

        // bai1 : dientichchuvihinhvuong
//        Scanner giatri = new Scanner(System.in);
//        System.out.println("Nhap vao canh a :");
//         float a = giatri.nextInt();
//        float chuvi = (a*a);
//        float dientich = 4 * a;
//        System.out.println("Dien tich hinh vuong la :" + dientich);
//        System.out.println("Chu vi hinh vuong la :"+ chuvi);
        //====================================



        // bai2 : dientichchuvihinhchunhat
//        Scanner giatri = new Scanner(System.in);
//        System.out.println("nhap vao chieu rong :");
//        float chieurong = giatri.nextFloat();
//        System.out.println("nhap vao chieu dai :");
//        float chieudai = giatri.nextFloat();
//        System.out.println("dien tich hcn la :" + chieudai*chieurong);
//        System.out.println("chu vi hcn la :"+ (chieudai+chieurong)*2);
        //=====================================


//         bai3 : nhập vào a,b thục hiện tính toán
        Scanner giatri = new Scanner(System.in);
        System.out.println("Nhâp vào số a ");
        float soA = giatri.nextFloat();
        System.out.println("Nhập vào số b ");
        float soB = giatri.nextFloat();
        float cong = soA + soB;
        float tru = soA - soB;
        float nhan = soA * soB;
        float chia = soA / soB;
        System.out.println("phep + la :" + cong);
        System.out.println("phép * la :" + nhan);
        System.out.println("phép - la : " + tru);
       System.out.println("phép / la :" + chia);
    }
}
