import array.ArrayProblems;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        ArrayProblems arrayProblems = new ArrayProblems();
        // int[] array = { 5, 2, 6, 8, 1, 9 };
        // arrayProblems.findPairWithGivenSum(array, 14);
        // arrayProblems.checkSubArrayWithTargetedSum(array, 0);

        /*
        int[] binaryArray = { 1, 0, 1, 0, 1, 0, 0, 1 };
        int[] sortedArray = arrayProblems.sortBinaryArray(binaryArray);
        for(int index=0; index<sortedArray.length; index++){
            System.out.print(sortedArray[index]+" ");
        }
        System.out.println();
        */
        /*
        int[] rearrangedArray = arrayProblems.rearrangeEvenOddNumbers(array);
        System.out.print("[");
        for(int index=0; index<rearrangedArray.length; index++){
            System.out.print(rearrangedArray[index]+" ");
        }
        System.out.println("]");
        */
        arrayProblems.findMaxLengthSubarray(array, 8);

    }
}
