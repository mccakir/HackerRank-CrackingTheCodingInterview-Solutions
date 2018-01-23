/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:

public class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int item)
        {
            data = item;
            left = right = null;
        }
}
*/

    boolean checkBST(Node root) {
        return checkNode(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
    }

    boolean checkNode(Node node, int min, int max){
        //End of branch
        if(node == null ) return true;
        
        //Check data
        if(node.data < min || node.data > max) { return false; }
        
        return (checkNode(node.left, min, node.data-1) && checkNode(node.right, node.data+1, max) );
    }
