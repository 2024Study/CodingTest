package CodingTest.sua.Bronze;

import java.io.*;

public class Honeycomb_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        /*공식화
        1 까지 거리 0
        2 ~ 7 까지 거리 1
        8 ~ 19 까지 거리 2
        20 ~ 37 까지 거리 3

        6각형이므로 6이랑 연관되게 생각해보기
        시작점은 1, 2, 8, 20
        끝점은 1, 7, 19, 37

        f(1) = 1
        f(2) = f(1) + 6 x 1 = 7
        f(3) = f(2) + 6 x 2 = 19
        f(4) = f(3) + 6 x 3 = 37
        f(n) = f(n-1) + 6 x (n-1)

         */


        int N = Integer.parseInt(br.readLine());

        int num = findNum(N);

        bw.write(String.valueOf(num));

        bw.flush();

        bw.close();

    }

    private static int findNum(int N) {

        if (N == 1) return 1;


    }
}
