package CodingTest.sua.Bronze;

import java.io.*;

public class Maximum_2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int max = 0;
        int maxIndex = 0;

        for(int i=1;i<=9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>max){
                max = num;
                maxIndex=i;
            }
        }

            bw.write(String.valueOf(max));
            bw.newLine();
            bw.write(String.valueOf(maxIndex));

            bw.flush();
            bw.close();



        }
    }