package BT6_ChiaHet_3_5;

import java.util.Scanner;

public class ChiaHet_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so de kiem tra: ");
        int input = sc.nextInt();
        int nam = input % 10;
        int ba = ((input / 100) + ((input % 100) / 10) + (((input % 100) % 10)));

        if (((nam == 0) || nam == 5) && (ba == 3 || ba == 6 || ba == 9) ){
            System.out.println("So chia het cho 3 va 5");
        } else if(ba == 3 || ba == 6 || ba == 9){
            System.out.println("So chi chia het cho 3");
        } else if (nam == 5 || nam == 0) {
            System.out.println("So chi chia het cho 5");
        } else {
            System.out.println("So khong chia het cho 3 va cung khong chia het cho 5");
        }
    }
}
