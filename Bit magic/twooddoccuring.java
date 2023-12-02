public class twooddoccuring {
    static void findTwoOdd(int arr[], int n) {
        int xor = arr[0];
        int set_bit_no;
        int i;
        int x = 0, y = 0;
        for (i = 1; i < n; i++) {
            xor ^= arr[i];
        }
        set_bit_no = xor & ~(xor - 1);
        for (i = 0; i < n; i++) {
            if ((arr[i] & set_bit_no) != 0) {
                x = x ^ arr[i];
            } else {
                y = y ^ arr[i];
            }
        }
        System.out.println("The two ODD elements are " + x + " & " + y);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 4, 4, 5, 5, 3, 3, 3 };
        int n = arr.length;
        findTwoOdd(arr, n);
    }
    
}
