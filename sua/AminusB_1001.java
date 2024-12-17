package CodingTest.sua;

import java.io.*;
import java.util.StringTokenizer;

public class AminusB_1001 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int res = A-B;

        bw.write(String.valueOf(res));

        bw.flush();

        bw.close();


    }

}
