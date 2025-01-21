package CodingTest.sua.Bronze;


import java.io.*;

public class President_2775 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int people = calPeople(k, n);

            bw.write(String.valueOf(people));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static int calPeople(int k, int n) {
        int[][] apt = new int[k + 1][n + 1];

        // 0층 초기화
        for (int i = 1; i <= n; i++) {
            apt[0][i] = i;
        }

        // 1층부터 k층까지 계산
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }

        return apt[k][n];
    }
}
