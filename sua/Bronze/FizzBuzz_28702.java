package CodingTest.sua.Bronze;

import java.io.*;


public class FizzBuzz_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 3; i > 0; i--){
            String s = br.readLine();
            if(s.matches("-?\\d+(\\.\\d+)?")){
                int n = Integer.parseInt(s) + i;
                if(n % 3 == 0){
                    if (n % 5 == 0) {
                        bw.write("FizzBuzz");
                    }else {
                        bw.write("Fizz");
                    }
                } else if (n % 5 == 0) {
                    bw.write("Buzz");
                }else {
                    bw.write(String.valueOf(n));
                }
                bw.newLine();
                bw.flush();
                return;
            }
        }
        br.close();
        bw.close();
    }
}
