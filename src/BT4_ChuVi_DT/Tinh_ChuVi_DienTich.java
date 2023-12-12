package BT4_ChuVi_DT;

import java.util.Scanner;

public class Tinh_ChuVi_DienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chi dai a = ");
        int cD = sc.nextInt();
        System.out.println("Nhap vao chi rong b = ");
        int cR = sc.nextInt();

        System.out.println("Chu vi la: " + (cD + cR) * 2);
        System.out.println("Dien tich la: " + cD*cR);
    }
}
