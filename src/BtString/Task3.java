package BtString;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        System.out.println("Enter the series to check");
        String input = new Scanner(System.in).nextLine();
        String contain = input.trim().replaceAll("\\s\\s+", " ");
        System.out.println(contain);
        String [] box = contain.split(" ");
        String con = "";
        for(int i = 0;  i < box.length; i++){
            con += String.valueOf(box[i].charAt(0)).toUpperCase() + box[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(con);

    }
}
