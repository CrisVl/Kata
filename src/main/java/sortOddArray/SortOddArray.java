package sortOddArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortOddArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[] {7,5,3,2,8,1,4,9})));
    }


    public static int[] sortArray(final int[] array) {
        //sort the odd number only
        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        IntStream.of(array).filter(e -> e % 2 == 1).boxed().sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(Integer::intValue).toArray();

        // then merge them back in to original array
        for(int j = 0, s = 0; j < array.length; j++) {
            if(array[j] % 2 == 1)
//                System.out.println(array[j]);
//            System.out.println(sortedOdd[s++]);
                array[j] = sortedOdd[s++];
        }

        return array;
    }
}
