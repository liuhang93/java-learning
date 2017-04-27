package interview;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'd'};
        String a = String.valueOf(chars);
        System.out.println(a);
        String b = String.copyValueOf(chars);
        System.out.println(b);
    }

    public static String toSixteen(int i) {
        return Integer.toHexString(i);
    }

    public static String toSixteen1(int i) {
        String str = "";
        while (i != 0) {
            str = i % 16 + str;
            i = i / 16;
        }
        return str;
    }

}
