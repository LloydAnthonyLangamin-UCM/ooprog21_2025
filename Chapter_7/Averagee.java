
public class Averagee {

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int count = 0;
        int sum = responseTimes[0];   // first value

        for (int i = 1; i < responseTimes.length; i++) {
            int avg = sum / i;        // average of previous values

            if (responseTimes[i] > avg) {
                count++;
            }

            sum += responseTimes[i];  // update sum
        }

        System.out.println(count);
    }
}
