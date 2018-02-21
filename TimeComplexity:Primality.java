import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            System.out.println( isPrime(n) ? "Prime" : "Not prime" ) ;
        }
    }
    
    static boolean isPrime(int x) {
        if(x < 2) return false;
        if(x == 2 || x == 3) return true;
        if(x%2 == 0 || x%3 == 0) return false;
        long sqrt = (long)(Math.sqrt((double) x)+1);
        for(long i = 6L; i <= sqrt; i += 6) {
            if(x%(i-1) == 0 || x%(i+1) == 0) return false;
        }
        return true;
    }
}
