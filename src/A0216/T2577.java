package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2577 {
    static int[] list = new int[10];
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            char[] tmp = Integer.toString(a*b*c).toCharArray();
            for(char t : tmp){
                int z = t - '0';
                list[z]++;
            }

            for(int tm : list){
                System.out.println(tm);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
