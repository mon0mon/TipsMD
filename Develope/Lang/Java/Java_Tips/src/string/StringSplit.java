package string;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String str = "boo:and:foo";

        System.out.println("Arrays.deepToString(str.split(\"o\"))");
        System.out.println(Arrays.deepToString(str.split("o")));

        System.out.println("\nArrays.deepToString(str.split(\"o\", 0))");
        System.out.println(Arrays.deepToString(str.split("o", 0)));

        System.out.println("\nArrays.deepToString(str.split(\"o\", 4))");
        System.out.println(Arrays.deepToString(str.split("o", 4)));

        System.out.println("\nArrays.deepToString(str.split(\"o\", 5))");
        System.out.println(Arrays.deepToString(str.split("o", 5)));

        System.out.println("\nArrays.deepToString(str.split(\"o\", -1))");
        System.out.println(Arrays.deepToString(str.split("o", -1)));

        System.out.println("\nArrays.deepToString(str.split(\"o\", -2))");
        System.out.println(Arrays.deepToString(str.split("o", -2)));
    }
}
