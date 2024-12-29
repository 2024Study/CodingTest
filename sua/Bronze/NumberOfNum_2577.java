package CodingTest.sua.Bronze;

import java.io.*;

public class NumberOfNum_2577 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());



        String res = Integer.toString(A*B*C);
        int[] count = new int[10];

        //count 배열에 각 1부터 9까지 숫자가 얼마나 나왔는지 출력
        for (char ch : res.toCharArray()) {
            //이 ch-0이ㅑ 문자를 숫자로 변환하는거야
            //예시) '5'의 ASCII 값(53) - '0'의 ASCII 값(48) = 5 이거 외워야댐
            count[ch - '0']++;
        }

        // 결과 출력
        for (int i = 0; i < 10; i++) {
            bw.write(count[i] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
