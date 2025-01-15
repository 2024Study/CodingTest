package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Snail_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = days(A, B, V);

        bw.write(String.valueOf(days));
        bw.flush();
        bw.close();


    }

    private static int days(int A, int B, int V){

        // (V - B) / (A - B) 최소 일 수
        //만약 나누어떨어지지않는다면 1일 더하기
        /*하루에 실제로 올라가는 거리: (A - B)
        마지막 날은 A만큼만 올라가면 됨
        실제 올락아ㅑ하는 순서거리 : (V - B)
        나머지가 있으면 하루 추가*/

        int res = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            res++;
        }


        return res;
    }
}
