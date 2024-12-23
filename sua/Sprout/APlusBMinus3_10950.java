package CodingTest.sua.Sprout;

import java.io.*;
import java.util.StringTokenizer;

public class APlusBMinus3_10950 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        //T값은 한줄에 단독으로 입력해야하므로 br.readLine으로 입력받아야함
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            //여러줄을 입력받으려면 매번 새로운 StringTokenizer 객체 생성 필요
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int res = A+B;
            bw.write(res+"\n");
        }

        bw.flush();
        bw.close();

    }

}
