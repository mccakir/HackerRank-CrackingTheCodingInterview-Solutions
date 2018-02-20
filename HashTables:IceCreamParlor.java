import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    static void solve(int[] arr, int money) {

        int tempMoney=0;
        Map<Integer, Integer> icecreams = new HashMap<>();

        //Pass array to map
        for(int i = 0; i<arr.length; i++){
            icecreams.put(arr[i], i);
        }
        //Check for ice creams with remaining money
        for (int i = 0; i<arr.length; i++){
            tempMoney = money - arr[i];
            if(tempMoney>0){
                if(icecreams.containsKey(tempMoney) && icecreams.get(tempMoney) != i) {
                    System.out.println((i+1)+" "+(icecreams.get(tempMoney)+1));
                    return ;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }
}
