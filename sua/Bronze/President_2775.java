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

        /*
        2층의 3호
= 1층의 1호 + 1층의 2호 + 1층의 3호
= (0층의 1호) + (0층의 1호+0층의 2호) + (0층의 1호+0층의 2호+3호)
= 1 + (1+2)+ (1+2+3)
=10*/
        return 0;
    }

}
