package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB_1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = A+B;

        bw.write(String.valueOf(sum)); // bw는 integer를 못쓰기 때문에 String을 변환해서 값 출력

        bw.flush();

        bw.close();

    }

}
