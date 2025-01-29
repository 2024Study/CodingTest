package CodingTest.sua.Silver;

import java.io.*;
import java.util.*;

public class SortByAge_10814 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 나이와 이름을 저장할 2차원 String 배열 선언
        String[][] people = new String[N][2];


        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            people[i][0] = input[0];  // 나이
            people[i][1] = input[1];  // 이름
        }

        //람다식 개굴
        Arrays.sort(people, (a, b) -> {
            if (Integer.parseInt(a[0]) == Integer.parseInt(b[0])) {
                return 0;  // 나이가 같으면 입력 순서 유지
            }
            //a-b가 음수면 순서유지, 양수면(a가 b보다 크면) 순서변경
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        // 결과 출력
        for (String[] person : people) {
            bw.write(person[0] + " " + person[1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
