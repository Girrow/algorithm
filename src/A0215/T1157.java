package A0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                arr[s.charAt(i) - 97]++;
            else
                arr[s.charAt(i) - 65]++;
        }
        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.print(ch);
    }



    public static void test(String[] args) {
        int[] save = new int[33];
        for(int i=0;i<33;i++){
            save[i]=0;
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        char[] inputs = new char[input.length()];
        for(int i=0;i<inputs.length;i++){
            inputs[i]=input.charAt(i);
        }
        for(char c : inputs){
            if(c > 96){
                c -= 96;
            }else{
                c-=64;
            }
            save[c]++;
        }
        int max = 0;
        int num= 0;
        for(int i = 0; i<33;i++){
            if(save[i]>max){
                max=save[i];
                num = i;
            }
        }
        char cc = (char) (num+1);
        System.out.println(cc);

    }
}
