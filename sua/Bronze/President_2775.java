package CodingTest.sua.Bronze;

import java.io.*;

public class President_2775 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int k = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());

        int peoeple = calPeople(T, k,n);

        bw.write(String.valueOf(peoeple));
        bw.flush();
        bw.close();

    }

    private static int calPeople(int T, int k, int n){
        return 0;
    }

}
