import java.util.*;

public class Solution {

  public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        String magazine;
        Hashtable<String, Integer> magazineTable =new Hashtable<String, Integer>();
        Hashtable<String, Integer> ransomTable =new Hashtable<String, Integer>();
      
        String ransom;
        boolean isFound=false;
      
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine = in.next();
            if(magazineTable.containsKey(magazine)){
            	magazineTable.replace(magazine, magazineTable.get(magazine)+1);
            }
            else{
            	magazineTable.put(magazine, 1);
            }
        }
        
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom = in.next();
            if(ransomTable.containsKey(ransom)){
            	ransomTable.replace(ransom, ransomTable.get(ransom)+1);
            }
            else{
            	ransomTable.put(ransom, 1);
            }
        }

        for(String key : ransomTable.keySet()){
        	if(magazineTable.containsKey(key) && magazineTable.get(key)>=ransomTable.get(key)){
        		isFound=true;
        	}
        	else{
        		isFound=false;
        		break;
        	}
        }
        
        if(isFound==true){
        	System.out.println("Yes");
        }
        else{ System.out.println("No"); }
    }
}
