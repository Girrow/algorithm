package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2908 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] first = st.nextToken().toCharArray();
            char[] second = st.nextToken().toCharArray();
            String a = "";
            String b = "";
            for(int i = first.length-1 ; i>=0;i--){
                a+=first[i];
            }
            for(int i = second.length-1 ; i>=0;i--){
                b+=second[i];
            }
            System.out.println(Math.max(Integer.parseInt(a),Integer.parseInt(b)));
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

