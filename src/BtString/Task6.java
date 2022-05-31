package BtString;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static  void swap(String a, String b, String swap){
        swap = a;
        a = b;
        b = swap;
    }
    public static void convertString(){
        System.out.println("Enter the sentence");
        String s = new Scanner(System.in).nextLine();
        String contain = s.replaceAll("\\s\\s+", " ").trim();
        String [] box = contain.split(" ");
        String swap = "";
        for (int i = 0; i < box.length - 1; i++) {
            for(int j = i + 1; j < box.length ; j++){
                if(box[i].compareTo(box[j]) > 0){
                    swap = box[i];
                    box[i] = box[j];
                    box[j] = swap;
                }
            }

        }
        System.out.println("Result of sentence after handling");
        for (int i = 0; i < box.length; i++) {
            System.out.print(box[i] + " ");

        }

    }

    public static void main(String[] args) {
        convertString();
    }
}
