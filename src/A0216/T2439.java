package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2439 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            for(int i=n;i>0;i--){
                for(int j=i-2;j>=0;j--){
                    System.out.print(" ");
                }
                for (int j=n-i;j>=0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
