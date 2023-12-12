package BT5_Diem_TB;

import java.util.Scanner;

public class Diem_TB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Toan: ");
        float toan = sc.nextInt();
        System.out.println("Nhap diem Ly: ");
        float ly = sc.nextInt();
        System.out.println("Nhap diem Hoa: ");
        float hoa = sc.nextInt();
        System.out.println("Nhap diem Van: ");
        float van = sc.nextInt();
        System.out.println("Nhap diem Tieng Anh: ");
        float tiengAnh = sc.nextInt();

        float diemTB = (toan + ly + hoa + van + tiengAnh)/ 5;
        if(diemTB >= 9){
            System.out.println("Xep loai XS");
        } else if (diemTB >= 8) {
            System.out.println("Xep loai G");
        } else if (diemTB >= 6.5) {
            System.out.println("Xep loai K");
        } else if (diemTB >= 5) {
            System.out.println("Xep loai TB");
        } else {
            System.out.println("Xep loai Y");
        }
    }

}
