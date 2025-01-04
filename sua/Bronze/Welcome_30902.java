package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Welcome_30902 {

    //셋째줄에 받는 셔츠 묶음 개수, 펜 묶음 개수로 나누기
    //티셔츠는 남아도되고 펜은 정확하게 나눠줘야함

    //티셔츠 : 사이즈별 신청자수를 T로 나누기
    //펜 : 참가자수 나누기 펜 묵음 낱개수

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //사이즈별 개수 배열에 담기
        int[] sizes = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());


        int t = calT(sizes, T);
        int[] p = calP(N, P);

        bw.write(t + "\n");
        bw.write(p[0] + " " + p[1]);
        bw.flush();
        bw.close();

    }

    //티셔츠 묶음 구하기
    private static int calT(int[] sizes, int T) {
        int bundles = 0;
        //묵음수로 나누고 올림한 값을 받아야하는데 Math.ceil 쓰려다가 잘안되서 걍 이렇게함
        for (int size : sizes) {
            bundles += (size + T - 1) / T;
        }
        return bundles;
    }

    //펜 묶음, 낱개구하기
    private static int[] calP(int N, int P) {
        int bundles = N / P;
        int remainder = N % P;
        return new int[]{bundles, remainder};
    }


}
