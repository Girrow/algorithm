package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2475 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            while(st.hasMoreTokens()){
                int tmp =Integer.parseInt(st.nextToken());
                 sum+= Math.pow(tmp,2);
            }
            int result = sum % 10;
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
