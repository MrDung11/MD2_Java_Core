package BT3;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        System.out.println("CHUYEN DOI TIEN TE");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ty gia: ");
        int tyGia = sc.nextInt();

        float tienDola;
        double tienVND;

//        System.out.println("Nhap 1 de chuyen $ sang VND va 2 de chuyen VND sang $");
//
//        int chose = sc.nextInt();
//        switch (chose){
//            case 1:
//                System.out.println("Nhap $: ");
//                tienDola = sc.nextFloat();
//                tienVND = tienDola * tyGia;
//                System.out.println("Gia tri sang VND la: " + tienVND);
//                break;
//            case 2:
//                System.out.println("Nhap VND: ");
//                tienVND = sc.nextDouble();
//                tienDola = (float)(tienVND / tyGia);
//                System.out.println("Gia tri sang $ la: " + tienDola);
//                break;
//        }

        System.out.print("Nhap vao so tien: ");
        float input = sc.nextFloat();
        System.out.print("Nhap vao don vi tien: ");
        sc.nextLine();
        String moneyType = sc.nextLine();
        if (moneyType.equalsIgnoreCase("VND")) {
            tienDola = input / tyGia;
            System.out.println("Tien VND doi sang $ la: " + tienDola + " $");
        } else if (moneyType.equalsIgnoreCase("$")) {
            tienVND = input * tyGia;
            System.out.println("Tien $ doi sang VND la: " + tienVND + " VND");
        }
    }
}
