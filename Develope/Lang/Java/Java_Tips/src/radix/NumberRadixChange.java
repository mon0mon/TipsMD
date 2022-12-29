package radix;

public class NumberRadixChange {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(Integer.toBinaryString(a));

        int b = 20;
        System.out.println(Integer.toOctalString(b));

        int c = 30;
        System.out.println(Integer.toHexString(c));

        String d = "00101";
        System.out.println(Integer.parseInt(d, 2));

        String e = "765";
        System.out.println(Integer.parseInt(e, 8));

        String f = "1de";
        System.out.println(Integer.parseInt(f, 16));

        int a1 = 120;
        String a1bi = "";

        while (a1 > 0) {
            a1bi = (a1 % 2) + a1bi;
            a1 /= 2;
        }

        System.out.println(a1bi);

        int a2 = 120;
        String a2bi = "";

        while (a2 > 0) {
            a2bi = a2bi + (a2 % 2);
            a2 /= 2;
        }

        System.out.println(a2bi);
    }
}
