package A0215;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2438 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
