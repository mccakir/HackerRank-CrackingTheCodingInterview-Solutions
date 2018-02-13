import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    static PriorityQueue<Integer> minimumHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maximumHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            //Calculate median for every new number
            calcMedian(a[a_i]);
        }
    }

    static void calcMedian(int newNum) {
        //Add new number to heap
        //Add first to maximumHeap
        if(maximumHeap.isEmpty()){
            maximumHeap.add(newNum);
        }
        else if(maximumHeap.size()==minimumHeap.size()){
            if (newNum < minimumHeap.peek() ){
                maximumHeap.add(newNum);
            }
            else{
                minimumHeap.add(newNum);
                //maximumHeap must be equal or greater element than minimumHeap
                maximumHeap.add(minimumHeap.remove());
            }
        }
        else if (maximumHeap.size() > minimumHeap.size()){
            if(newNum > maximumHeap.peek()){
                minimumHeap.add(newNum);
            }
            else {
                maximumHeap.add(newNum);
                minimumHeap.add(maximumHeap.remove());
            }
        }

        //Print median
        if(maximumHeap.isEmpty()){
            System.out.println(0.0);
        }
        //Even number of elements
        else if (maximumHeap.size() == minimumHeap.size()){
            System.out.println( (maximumHeap.peek()+minimumHeap.peek())/2.0 );
        }
        //Odd number of elements
        else {
            System.out.println( (double)(maximumHeap.peek()));
        }
    }
}
