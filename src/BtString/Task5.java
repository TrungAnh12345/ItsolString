package BtString;

import java.util.Scanner;

public class Task5 {
    public static void handleString(){
        String s = new Scanner(System.in).nextLine();
        String contain = s.trim().replaceAll("\\s\\s+", " ");
        String [] con = contain.split(" ");
        String res = con[con.length - 1] ;
        for(int i = 0 ; i < con.length - 1; i++){
            res +=" "+ con[i] ;
        }
        System.out.println(res);

//        String kq = "";
//        for(int i = con.length - 1; i > 0; i++){
//
//        }
    }
    public static void main(String[] args) {
        handleString();
    }
}
