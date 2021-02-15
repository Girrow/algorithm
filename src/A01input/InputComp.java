package A01input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputComp {

    public static void main(String[] args) {
//        1번
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st =new StringTokenizer(br.readLine());
            int result=0;
            while(st.hasMoreTokens()) {
                st.nextToken();
                result++;
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        2번
        Scanner sc = new Scanner(System.in);

//        3번
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<10; i++){
            sb2.append(i+"\n");
        }
        System.out.print(sb);
    }
}
