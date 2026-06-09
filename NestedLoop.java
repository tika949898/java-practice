public class NestedLoop {
    public static void main(String[] args) {
// outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop is:" + i);
// inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop:" + j);
            }
        }
    }
}