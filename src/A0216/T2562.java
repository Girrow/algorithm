package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2562 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int cnt= -1;
            int max= -1;
            for(int i=0;i<9;i++){
                int n = Integer.parseInt(br.readLine());
                if(n>max){
                    cnt=i+1;
                    max=n;
                }
            }
            System.out.println(max);
            System.out.println(cnt);
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
