package CodingTest.sua.Silver;

import java.io.*;

public class SugarDelivery_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int result = calculBags(N);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    //외부에서 쓰지않고 내부에서만 쓰니까 private선언
    //java 메소드 만들때 static으로 선언해야 객체 생성없이 직접 호출하니까 메모리 성능좋음
    private static int calculBags(int N) {
        if (N % 5 == 0) {
            return N / 5;
        }

        for (int i = N / 5; i >= 0; i--) {
            int remainder = N - (5 * i);
            if (remainder % 3 == 0) {
                return i + (remainder / 3);
            }
        }

        return -1;
    }
}
