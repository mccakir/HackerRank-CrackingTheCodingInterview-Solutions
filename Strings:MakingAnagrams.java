import java.util.*;

public class Solution {
    
    //Calculates given array's letter frequency
    public static int[] letterCounter(String input){
    	int [] letters = new int[26];
    	
    	for(char c:input.toCharArray()){
    		letters[c-'a']+=1;
    	}    	
    	return letters;
    }
    
    //Returns number needed to make anagram
    public static int numberNeeded(String first, String second) {
    	  //Calculate letter frequency for each given string
	  int [] firstStringLetters = letterCounter(first);
	  int [] secondStringLetters = letterCounter(second);
	  int deletedLettersCount=0;
	      
	  //Compare two array's letters
	  for (int i = 0; i < firstStringLetters.length; i++) {
	  	deletedLettersCount+=Math.abs( firstStringLetters[i]-secondStringLetters[i] );
	  }
	  return deletedLettersCount;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }  
}
