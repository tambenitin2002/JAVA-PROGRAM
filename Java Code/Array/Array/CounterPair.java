public class CounterPair {
    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        int cnt = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    cnt++;
                }
            }
        }
        System.out.println("Number of pairs with sum " + target + ": " + cnt);
    }
}
