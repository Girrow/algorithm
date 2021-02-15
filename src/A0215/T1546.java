package A0215;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T1546 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arrays = new int[n];

            int max = 0;
            for(int i=0;i<arrays.length;i++){
                arrays[i]=Integer.parseInt(st.nextToken());
                if(arrays[i]>max){
                    max=arrays[i];
                }
            }
            double sum = 0;
            for(int i=0;i<arrays.length;i++){
                Double d = (double)arrays[i]/(double)max * 100;
                sum+=d;
            }
            sum/=n;
            System.out.println(sum);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
