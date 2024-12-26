package CodingTest.sua.Bronze;

import java.io.*;

public class OX_8958 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        // O는 누적합이니까 sum+= ㅇㅈㄹ로 해보기
        // X는 그냥 0
        // 배열로 푸는게 더빠른가?

        for (int i = 0; i < T; i++) {
            String answer = br.readLine();
            int score = 0;
            int reset = 0;

            for (char c : answer.toCharArray()) {
                if (c == 'O') {
                    reset++;
                    score += reset;
                } else {
                    reset = 0;
                }
            }
            bw.write(String.valueOf(score));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
