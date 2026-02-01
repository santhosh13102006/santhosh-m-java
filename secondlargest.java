public class second_largest {
    public static void main(String[] args) {
        int[] arr = {23, 23, 42, 21, 34, 33};
        int res = secondlargest(arr);
        System.out.println(res);
    }
    public static int secondlargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num :arr) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num < largest && num > secondlargest) {
                secondlargest = num;
            }
        }
            if (secondlargest == Integer.MIN_VALUE)
                return -1;
            return secondlargest;
        }
}