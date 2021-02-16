package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2884 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(M < 45){
                M +=15;
                if(H==0) H=23;
                else H-=1;
            }else{
                M -=45;
            }
            System.out.println(H+" "+M);
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
