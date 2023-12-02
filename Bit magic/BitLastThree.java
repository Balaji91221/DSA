public class BitLastThree {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x << 1);  // Left shift (multiply by 2)
        System.out.println(y << 1);  // Left shift (multiply by 2)
        System.out.println(x >> 1);  // Right shift (divide by 2)
        System.out.println(y >> 1);  // Right shift (divide by 2)
        System.out.println(~x);      // Bitwise NOT (complement)
        System.out.println(~y);      // Bitwise NOT (complement)
    }
}
