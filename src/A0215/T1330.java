package A0215;

import java.util.Scanner;

public class T1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        if (first > second){
            System.out.println(">");
        }else if (first < second){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
