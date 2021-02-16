package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T8958 {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            for(int z = 0; z<n;z++){
                StringTokenizer st = new StringTokenizer(br.readLine().trim());
                char[] list = st.nextToken().toCharArray();
                int score = 1;
                int sum = 0;
                for(char c : list){
                    if(c == 'O'){
                        if(score < 1) score = 1;
                        sum+=score;
                        score+=1;
                    }else{
                        score = 0;
                        continue;
                    }
                }
                System.out.println(sum);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
      
    }
}
