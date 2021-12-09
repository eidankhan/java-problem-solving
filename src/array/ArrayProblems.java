package array;

public class ArrayProblems {
    public void findPairWithGivenSum(int[] array, int sum){
        boolean found = false;
        for(int counter = 0; counter < array.length; counter++){
            for(int index = 0; index < array.length; index++){
                if(array[counter] != array[index]){
                    int pair = array[counter] + array[index];
                    if(pair == sum){
                        found = true;
                        System.out.println("Pair found ("+array[counter]+","+array[index]+")");
                        array[counter] = 0;
                        array[index] = 0;
                    }
                }
            }
        }
        if(!found)
            System.out.println("Pair not found");
    }
}
