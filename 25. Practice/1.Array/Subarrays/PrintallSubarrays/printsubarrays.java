public class printsubarrays{
    public static void printSubarrays(int numbers[]){

        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                for(int k = i ;k <= j;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8 };
        printSubarrays(numbers);
    }
}