package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2675 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int m = Integer.parseInt(st.nextToken());
                char[] charArr = st.nextToken().toCharArray();
                for(char c : charArr){
                    for(int k=0;k<m;k++){
                        sb.append(c);
                    }
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
