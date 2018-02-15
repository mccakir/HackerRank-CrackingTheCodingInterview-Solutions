import java.util.*;

public class Solution {
    
    static int numberOfSwaps;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] data = new int [n];
        
        for(int i=0; i<n; i++){
            data[i]=in.nextInt();
        }
        
        data=bubleSort(data);
        
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+data[0]);
        System.out.println("Last Element: "+data[data.length-1]);
    }
    
    public static int[] bubleSort(int [] data){
        boolean flag=true;
		numberOfSwaps=0;
		while(flag){
			flag=false;
			for (int i = 1; i < data.length; i++) {
				int temp=0;
				if(data[i-1]>data[i]){
					temp=data[i-1];
					data[i-1]=data[i];
					data[i]=temp;
					flag=true;
                    numberOfSwaps++;
				}
			}
		}
        return data;
    }
}
