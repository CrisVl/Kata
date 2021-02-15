package sumToTheNthParameter;

/**
 * Sum of the nth term of series
 *
 */
public class SumToNthParameter {

    public static void main(String[] args) {
        System.out.println(seriesSum(12));
    }
        public static String seriesSum(int n) {
            double sum = 0;
            if(n == 0) {
                return String.valueOf(sum);
            } else {
                for(int i = 0; i< n; i++){
                    sum +=Double.valueOf(1) / Double.valueOf(1 + i * 3);
//                    sum +=1.0 / (1 + i * 3);
                }
                return String.format("%.2f", sum);
            }
        }
}
