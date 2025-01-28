    package CodingTest.jihyeon.Week02.bronze;

    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;
    import java.util.HashSet;

    public class remainder_3052 {
        private static final int DIVIDE_NUMBER = 42;
        private static final int DIVIDE_COUNT = 10;

        public static void main(String[] args) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            HashSet<Integer> remainders = new HashSet<>();

            for (int i = 0; i < DIVIDE_COUNT; i++) {
                int number = Integer.parseInt(br.readLine());
                remainders.add(number % DIVIDE_NUMBER);
            }
            bw.write(String.valueOf(remainders.size()));

            bw.flush();
            bw.close();
        }
    }
