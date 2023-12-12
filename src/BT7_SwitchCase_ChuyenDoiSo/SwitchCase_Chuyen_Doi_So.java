package BT7_SwitchCase_ChuyenDoiSo;

import java.util.Scanner;

public class SwitchCase_Chuyen_Doi_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so can doc: ");
        int input = sc.nextInt();

        switch (input){
            case 1:
                System.out.println("So mot");
                break;
            case 2:
                System.out.println("So hai");
                break;
            case 3:
                System.out.println("So ba");
                break;
            case 4:
                System.out.println("So bon");
                break;
            case 5:
                System.out.println("So nam");
                break;
            case 6:
                System.out.println("So sau");
                break;
            case 7:
                System.out.println("So bay");
                break;
            case 8:
                System.out.println("So tam");
                break;
            case 9:
                System.out.println("So chin");
                break;
        }
    }
}
