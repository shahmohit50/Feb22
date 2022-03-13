package AssignTwo;

/**
 * reverseNumber
 */
public class reverseNumber {

    public static void main(String[] args) {

        reverse(10);
    }
    static void reverse(int n){
        if (n < 0) {
            return;
        }
        System.out.print(" "+n+" ");
        reverse(n-1);
    }
}
