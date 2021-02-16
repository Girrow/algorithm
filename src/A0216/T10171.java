package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T10171 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringBuilder sb = new StringBuilder();
            sb.append("\\    /\\\n");
            sb.append(" )  ( ')\n");
            sb.append("(  /  )\n");
            sb.append(" \\(__)|\n");
            System.out.println(sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
