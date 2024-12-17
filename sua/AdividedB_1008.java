package CodingTest.sua;

import java.io.*;
import java.util.StringTokenizer;

public class AdividedB_1008 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());


        float A = Float.parseFloat(st.nextToken());
        float B = Float.parseFloat(st.nextToken());

        float res = A/B;

        bw.write(String.valueOf(res));

        bw.flush();

        bw.close();

    }
}
