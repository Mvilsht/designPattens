package otherTopics.IQ_td;

import java.util.Arrays;

//Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements that
// are less than the parameter lessThan. For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because
// there are two array elements less than 4.


public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int i =0;

        while (i < sortedArray.length && sortedArray[i] < lessThan){
            i++;
        }
        System.out.println("i: " + i);
        return i;
    }

    public static int countNumbers2(int[] sortedArray, int lessThen) {

        //IntStream ins = Arrays.stream(sortedArray).filter(condition::test);
        long answer = Arrays.stream(sortedArray).filter(currVal -> currVal < lessThen).count();

        return (int)answer;
    }

    public static int countNumbers3(int[] sortedArray, int lessThan) {
        int start = 0;
        int end = sortedArray.length - 1;
        int mid = 0;

        while (start <= end){
            mid = (start + end) / 2;

            if (sortedArray[mid] < lessThan){
                if (mid < sortedArray.length - 1 && sortedArray[mid +1] < lessThan){
                    start = mid + 1;
                    continue;
                }else {
                    return mid + 1;
                }
            }
            end = mid -1;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers3(new int[] { 1, 3, 5, 7 }, 7));
    }
}