import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Number of items
        int n = in.nextInt();
        //Left shift numebr
        int k = in.nextInt();
        //Initialized array
        int a[] = new int[n];        
        //Load array
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //Rotate left k times
        a = arrayLeftRotation(a, n, k);
        
        //Print rotated array
        for(int i : a){
            System.out.print(i +" ");
        }
    }
    
    static int [] arrayLeftRotation(int data[], int n, int k){
        //Temporary array
        int [] b = new int [n];
        for(int i=0; i<n; i++){
            //Add end of array
        	if((i-k)<0){
        		b[n+i-k] = data[i];
        	}
            //Rotate left k times
        	else {
        		b[i-k] = data[i];
        	}
        }
        return b;
    }
}
