package BtString;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void handleString(){
        System.out.println("Enter the series to check");
        String input = new Scanner((System.in)).nextLine();
        String [] arrayS = input.split(" ");
        String max = " ";
        String con  = "";
        for (int i = 0; i < arrayS.length; i++){
            if(max.length() < arrayS[i].length()){
                max = arrayS[i];

            }
        }
        System.out.println("The biggest series: " + max);
        int pos = 0;
        for(int i = 0; i < arrayS.length; i++){
            if(max == arrayS[i]){
                System.out.println("possition thứ " + (pos + 1));
            }
            pos  = pos + (arrayS[i].length() + 1);
        }

    }
    public static void main(String[] args) {
        handleString();


    }
}
