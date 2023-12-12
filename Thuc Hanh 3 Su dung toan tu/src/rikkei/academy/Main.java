package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width; // Khai bao chieu rong
        float height; // Khai bao chieu dai
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = sc.nextInt();   // Nhap chieu rong
        System.out.print("Enter height: ");
        height = sc.nextInt();  // Nhap chieu cao
        float area = width * height;    // Khai bao bien area va tinh dien tich
        System.out.println("Area is " + area);  // In ra ket qua dien tich
    }
}
