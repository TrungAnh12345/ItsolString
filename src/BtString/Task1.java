package BtString;

import java.util.Scanner;

public class Task1 {
    public static boolean checkString(){
        System.out.println("enter the number to check ");
        int number = new Scanner(System.in).nextInt();
        String convert =  Integer.toString(number);
        int size = convert.length();
        for(int i = 0; i < (size / 2); i++) {
            if(convert.charAt(i) == convert.charAt(--size)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        if(checkString()){
            System.out.println("Đây là số thuận nghịch");
        }
        else{
            System.out.println("Không phải số thuận nghịch");
        }
    }

}
