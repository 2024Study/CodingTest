package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Snail_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = days(A, B, V);

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();





    }

    private static int days(int A, int B, int V){

        //A 미터 + (-B 미터)/V = res

        int res = (A-B)/V;


        return res;
    }
}
