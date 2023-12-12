package BT3_DocSoThanhChu;

import java.util.Scanner;

public class DoiSoThanhChu {
    public static void main(String[] args) {
        System.out.print("Nhap vao so can doc: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s = "";

        int hundred = number / 100;
        int dozen = (number / 10) % 10;
        int unit = (number % 100) % 10;

        String s100 = "";
        String s10 = "";
        String s1 = "";

        if (number >= 100) {

            if (hundred == 1) {
                s100 = "Một trăm";
            }
            if (hundred == 2) {
                s100 = "Hai trăm";
            }
            if (hundred == 3) {
                s100 = "Ba trăm";
            }
            if (hundred == 4) {
                s100 = "Bốn trăm";
            }
            if (hundred == 5) {
                s100 = "Năm trăm";
            }
            if (hundred == 6) {
                s100 = "Sáu trăm";
            }
            if (hundred == 7) {
                s100 = "Bảy trăm";
            }
            if (hundred == 8) {
                s100 = "Tám trăm";
            }
            if (hundred == 9) {
                s100 = "Chín trăm";
            }

            if (dozen == 1) {
                s10 = " mười";
            }
            if (dozen == 2) {
                s10 = " hai mươi";
            }
            if (dozen == 3) {
                s10 = " ba mươi";
            }
            if (dozen == 4) {
                s10 = " bốn mươi";
            }
            if (dozen == 5) {
                s10 = " năm mươi";
            }
            if (dozen == 6) {
                s10 = " sáu mươi";
            }
            if (dozen == 7) {
                s10 = " bảy mươi";
            }
            if (dozen == 8) {
                s10 = " tám mươi";
            }
            if (dozen == 9) {
                s10 = " chín mươi";
            }

            if (dozen == 0 && unit != 0) {
                s10 = " linh";
            }

            if (unit == 0 && dozen == 0) {
                s1 = " ";
            }

            if (unit == 1 && dozen != 0 && dozen != 1) {
                s1 = " mốt";
            }

            if (unit == 1 && dozen == 1) {
                s1 = " một";
            }

            if (unit == 2) {
                s1 = " hai";
            }
            if (unit == 3) {
                s1 = " ba";
            }
            if (unit == 4) {
                s1 = " bốn";
            }
            if (unit == 5) {
                s1 = " năm";
            }
            if (unit == 6) {
                s1 = " sáu";
            }
            if (unit == 7) {
                s1 = " bảy";
            }
            if (unit == 8) {
                s1 = " tám";
            }
            if (unit == 9) {
                s1 = " chín";
            }

            s = s100 + s10 + s1;
        }

        if (number < 100) {
            if (dozen == 1) {
                s10 = "Mười";
            }
            if (dozen == 2) {
                s10 = "Hai mươi";
            }
            if (dozen == 3) {
                s10 = "Ba mươi";
            }
            if (dozen == 4) {
                s10 = "Bốn mươi";
            }
            if (dozen == 5) {
                s10 = "Năm mươi";
            }
            if (dozen == 6) {
                s10 = "Sáu mươi";
            }
            if (dozen == 7) {
                s10 = "Bảy mươi";
            }
            if (dozen == 8) {
                s10 = "Tám mươi";
            }
            if (dozen == 9) {
                s10 = "Chín mươi";
            }

            if (unit == 0) {
                s1 = " ";
            }

            if (unit == 1) {
                s1 = " một";
            }

            if (unit == 1 && dozen != 1) {
                s1 = " mốt";
            }
            if (unit == 2) {
                s1 = " hai";
            }
            if (unit == 3) {
                s1 = " ba";
            }
            if (unit == 4) {
                s1 = " bốn";
            }
            if (unit == 5) {
                s1 = " năm";
            }
            if (unit == 6) {
                s1 = " sáu";
            }
            if (unit == 7) {
                s1 = " bảy";
            }
            if (unit == 8) {
                s1 = " tám";
            }
            if (unit == 9) {
                s1 = " chín";
            }

            s = s10 + s1;
        }

        if (number < 10) {
            if (unit == 0) {
                s1 = "Không";
            }

            if (unit == 1) {
                s1 = "Một";
            }
            if (unit == 2) {
                s1 = "Hai";
            }
            if (unit == 3) {
                s1 = "Ba";
            }
            if (unit == 4) {
                s1 = "Bốn";
            }
            if (unit == 5) {
                s1 = "Năm";
            }
            if (unit == 6) {
                s1 = "Sáu";
            }
            if (unit == 7) {
                s1 = "Bảy";
            }
            if (unit == 8) {
                s1 = "Tám";
            }
            if (unit == 9) {
                s1 = "Chín";
            }

            s = s1;
        }
        System.out.println(s);
    }
}
