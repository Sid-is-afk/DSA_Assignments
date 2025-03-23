import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                        }
                        }
                        System.out.println("Maximum element is: " + max);
                        System.out.println("Minimum element is: " + min);
    sc.close();
    System.out.println("Hello");
                    }
}
