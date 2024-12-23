package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class AdividedB_1008 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());


        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        double res = A/B;

        bw.write(String.format("%.9f",res));

        bw.flush();

        bw.close();

    }
}
