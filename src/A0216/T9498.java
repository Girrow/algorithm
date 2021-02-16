package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T9498 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            char c;
            if(n >=90) c = 'A';
            else if(n>=80) c = 'B';
            else if(n>=70) c = 'C';
            else if(n>=60) c = 'D';
            else  c = 'F';
            System.out.println(c);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
