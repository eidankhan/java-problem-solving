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
                    }
                }
            }
        }
        if(!found)
            System.out.println("Pair not found");
    }

    public void checkSubArrayWithTargetedSum(int array[], int targetedSum){
        for(int x=0; x<array.length; x++){
            int sum = 0;
            for(int y=x; y<array.length; y++){
               sum += array[y];
               if(sum == targetedSum){
                   int lower = x;
                   int higher = y;
                   System.out.print("{");
                   while(lower <= higher){
                       System.out.print(array[lower]);
                       ++lower;
                       if(lower <= higher)
                            System.out.print(",");
                   }
                   System.out.println("}");
               }
            }
        }
    }

    public int[] sortBinaryArray(int[] array){
        // Input:  { 1, 0, 1, 0, 1, 0, 0, 1 }

        for(int index=0; index<array.length; index++){
            for(int x=index+1; x<array.length; x++){
                if(array[index] > array[x]){
                    int temp = array[index];
                    array[index] = array[x];
                    array[x] = temp;
                }
            }
        }
        return array;
    }
}
