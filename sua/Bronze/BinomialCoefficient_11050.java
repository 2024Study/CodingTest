package CodingTest.sua.Bronze;

import java.io.*;

public class BinomialCoefficient_11050 {
    //이항계수....음 ... 5C2같은거..?
    //dp로 푸는 방버은 이해안가니까 팩토리얼로품

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);


        int result = binomialCoefficient(N, K);

        // 결과 출력
        bw.write(String.valueOf(result));
        bw.newLine(); // 줄 바꿈
        bw.flush(); // 버퍼 비우기
        bw.close(); // BufferedWriter 닫기
        br.close(); // BufferedReader 닫기
    }

    private static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
