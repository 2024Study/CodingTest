package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class CompareTwoNumbers_1330 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        //삼항 연산자
        bw.write((A>B)?">":(A<B)?"<":"==");

        bw.flush();

        bw.close();

    }

}
