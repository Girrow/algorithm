package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class T3052 {
    static HashMap<Integer,String> map = new HashMap<Integer,String>();

    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            for(int i=0;i<10;i++){
                int n = Integer.parseInt(br.readLine());
                map.put(n%42,"");
            }
            System.out.println(map.size());

        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
