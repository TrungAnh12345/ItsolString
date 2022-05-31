package BtString;

import java.util.Scanner;

public class Task2 {

    public static void convertString(){
        System.out.println("Enter the series to convert");
        String s = new Scanner(System.in).nextLine();

        for(int i = 0; i < s.length(); i++){
            String convert =  "";
            if(i % 2 == 0){
                convert = (convert + s.charAt(i)).toUpperCase();
                System.out.print(convert + "");
            }
            else if(i % 2 != 0){
                convert = (convert + s.charAt(i)).toLowerCase();
                System.out.print(convert + "");
            }
        }

    }
    public static void main(String[] args) {
        convertString();



    }
}
