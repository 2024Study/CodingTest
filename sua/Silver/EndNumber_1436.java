package CodingTest.sua.Silver;

import java.io.*;


public class EndNumber_1436 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = calEndNumber(N);

        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }

    private static int calEndNumber(int N){
        //666부터 시작해서 N번째로 666이 들어가는 숫자 반환
        // 1~6 까지는 5666, 7~ 6660, 6661
        int cnt = 0;
        int num = 666;

        while (cnt <N){
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
            if (cnt == N){
                break;
            }
            num++;
        }
        return num;
    }


}
