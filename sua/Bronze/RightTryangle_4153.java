package CodingTest.sua.Bronze;

import java.io.*;
import java.util.*;

public class RightTryangle_4153 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            if (a == 0 && b == 0 && c == 0) break;


            int[] squares = {a*a, b*b, c*c};
            Arrays.sort(squares);  // 오름차순 정렬


            if (squares[0] + squares[1] == squares[2]) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
