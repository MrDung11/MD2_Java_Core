package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram): ");
        weight = sc.nextDouble();

        System.out.print("Your height (in meter): ");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);

        // printf là: print format

        // "%-20s%s": Tạo một độ dài bằng 20 ký tự, nếu chuỗi lớn hơn sẽ cắt ngắn đi; nếu chuỗi ngắn hơn sẽ tự có khoảng trống để đủ độ dài 20 ký tự
        // "%-20.2f%s": Tạo một độ dài bằng 20 ký tự, nếu số float lớn hơn sẽ cắt ngắn đi; nếu số float ngắn hơn sẽ tự có khoảng trống để đủ độ dài 20 ký tự
        // printf: để nhận trực tiếp giá trị qua %f

        // %-20: Quy định độ dài in ra cho chuỗi thứ nhất là 20: cho chuỗi String bmi
        // s: Cho chuỗi String bmi
        // %s: Cho chuỗi String phía sau Interpretation

        // %-20: Quy định độ dài in ra cho chuỗi thứ nhất là 20: cho chỉ số bmi
        // .2f: Hai chữ số sau dấu phẩy ở chỉ số bmi
        // %s: Cho chuỗi String phía sau

        // https://gpcoder.com/2352-huong-dan-su-dung-string-format-trong-java/

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if(bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
