public class BreakContinue1 {
    public static void main(String[] args){
        int[] numbers = {3, 4, -2, 5, 0, 8, 9};
        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0 ) {
               break;
            }
        System.out.println(n);
        }
    }
}