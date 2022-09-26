package bai11;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Nhập số điện cũ : ");
        int socu = sr.nextInt();
        System.out.println("Nhập vào sô điện mới :");
        int somoi = sr.nextInt();
        int thuebao = 10000;
        int sodien = somoi-socu;
        if (sodien<50) {
            int tiendien = sodien * 700 + thuebao;
            System.out.printf("số điện: %d , tiền điện : %d" ,sodien ,tiendien);
        } else if ( sodien>=50 && sodien<100){
            int tiendien = (thuebao + 50 * 700 )+ (sodien-50)*900;
            System.out.printf("số điện: %d,tiền điên :%d ",sodien,tiendien);
        } else if (sodien >=100 && sodien < 150 ) {
            int tiendien = (thuebao + 50 * 700)+(50*900) + (sodien-100)*1100;
            System.out.printf("số điện :%d , tiền điện :%d ",sodien,tiendien );
        }else if ( sodien > 150 ) {
            int tiendien = (thuebao + 50*700) +(50*900) +(50 * 1100 )+(sodien-150)*1300;
            System.out.printf("số điện :%d, tiền điên : %d",sodien,tiendien);
        }
    }
}
