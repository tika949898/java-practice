public class ArraysSum {
  public static void main(String[] args) {
    int[] num = {20, 10, 30};
    int sum = 0;
    for (int i = 0; i< num.length; i++) {
      sum += num[i];
    }
    System.out.println("The arrays of sum: " + sum);
  }
}