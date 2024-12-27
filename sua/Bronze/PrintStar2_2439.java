package CodingTest.sua.Bronze;

import java.io.*;

public class PrintStar2_2439 {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        //공백을 j-i값한만큼 출력?? 하고 별찍기??
        for(int i=1; i<=N; i++){

            //나이거 5분만에품 ㅎㅎ 칭찬점ㅎㅎ
            for(int k=N-1; k>=i; k--){
                bw.write(" ");
            }

            for(int j=1; j<=i; j++){
                bw.write("*");
            }

            bw.newLine();

        }

        bw.flush();
        bw.close();


    }

}
