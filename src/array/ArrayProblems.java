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
                   //System.out.println("Sub array with length "+length+"["+ x+"..."+y+"]");
               }
            }
        }
    }
}
