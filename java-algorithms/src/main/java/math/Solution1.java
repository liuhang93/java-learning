package math;

/**
 * Created by liuhang on 2017/4/26.
 * 求最小公倍数或最大公约数;求n个数的最小公倍数或最大公约数
 */
public class Solution1 {
    public static int greatestCommonDivisor(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    public static int greatestCommonDivisorOfArray(int[] arr, int n) {
        if (n == 1) return arr[0];
        return greatestCommonDivisor(arr[n - 1], greatestCommonDivisorOfArray(arr, n - 1));
    }

    public static int lowestCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }

    public static int lowestCommonMultipleOfArray(int[] arr, int n) {
        if (n == 1) return arr[0];
        return lowestCommonMultiple(arr[n - 1], lowestCommonMultipleOfArray(arr, n - 1));
    }


    public static void main(String[] args) {
        int[] arr = new int[]{6, 9, 15};
        System.out.println(greatestCommonDivisor(6, 9));
        System.out.println(greatestCommonDivisorOfArray(arr, 3));
        System.out.println(lowestCommonMultipleOfArray(arr, 3));
    }
}
