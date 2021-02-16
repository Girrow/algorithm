package A0216;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T2741 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = n; i >= 1; i--) {
                sb.append(i+"\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
