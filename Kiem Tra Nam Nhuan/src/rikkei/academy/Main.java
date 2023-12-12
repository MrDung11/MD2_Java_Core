package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                }else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            }else {
                System.out.printf("%d is a leap year", year);
            }
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }

        /*
        •	Chú ý: Ở đây ta dùng: System.out.printf()
         – Khác với System.out.printl() và System.out.print()
          “Nhận trực tiếp tham số chuyền từ ngoài in trong chuỗi thông qua %d”
         */
    }
}
