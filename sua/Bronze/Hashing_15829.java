package CodingTest.sua.Bronze;

import java.io.*;

public class Hashing_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int res = calHash(N);



        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }


    private static int calHash(int N){

    }
}
