package BtString;

import java.util.Scanner;

public class Task7 {
    public static void removeSeries(){
        System.out.println("Nhập vào chuỗi 1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào chuỗi 2: ");
        String s2 = new Scanner(System.in).nextLine();
        String [] contain = s1.split(" ");
        String s3 = "";
        for(int i = 0; i < contain.length; i++){
            if(contain[i].equals(s2)){
                s3 = s1.replace(contain[i], "");
            }
        }
        String s4 = s3.trim().replaceAll("\\s\\s+", " ");

        System.out.println(s4);

    }

    public static void main(String[] args) {
        removeSeries();
    }
}
