package BT2;

public class BT2 {
    public static void main(String[] args) {

        String name = "";
        boolean isCheck = false;
        char charName = 0;
        float variableFloat = 1;

        int number1 = 1;
        byte number2;
        int number3 = 3;

        number2 = (byte) (number1 + number3);
        System.out.println("number1 " + number1);
        System.out.println("number2 " + number2);
        System.out.println("name " + name);
        System.out.println("isCheck ---> " + isCheck);
        System.out.println("charName ---> " + charName);
        System.out.println("variableFloat ---> " + variableFloat);
        System.out.println("=====================================");

        int a = 5;

        // Tìm hiểu thứ tự thực hện các toán tử

        // > thực hiện trước và ++ thực hiện sau
        if(a++ > 5){
            System.out.println("Dung");
        }else {
            System.out.println("Sai");
        }

        int b = 5;

        // ++ thực hiện trước và > thực hiện sau
        if(++b > 5){
            System.out.println("Dung");
        }else {
            System.out.println("Sai");
        }
    }
}
