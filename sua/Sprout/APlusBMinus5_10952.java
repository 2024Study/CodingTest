package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class APlusBMinus5_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break; // A와 B가 모두 0이면 루프 종료
            }

            int res = A + B;
            sb.append(res).append("\n");
        }

        bw.write(sb.toString()); //sb에 있는 결과값들을 하나의 String으로 변환하여 bw에 저장
        bw.flush();
        bw.close();
        br.close();

    }
}
