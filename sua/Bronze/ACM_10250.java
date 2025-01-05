package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class ACM_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());  // W는 사용하지 않지만 입력은 받아야함, 문제가 그럼
            int N = Integer.parseInt(st.nextToken());

            int floor = N % H == 0 ? H : N % H;
            int room = (N - 1) / H + 1;

            bw.write(String.format("%d%02d\n", floor, room));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

