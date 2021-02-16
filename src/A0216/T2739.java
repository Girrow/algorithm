package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2739 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            for(int i=1;i<=9;i++){
                sb.append(n+" * "+i+" = " + n*i+"\n");
            }
            System.out.println(sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
