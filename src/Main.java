import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// iterative solution. im trying too hard to use DFS when i can just use logic
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        boolean flag = false;

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (flag){ return root;}
            if (root.val == p.val){
                flag = true;
            }
            root = root.right;
        }
    }
}

//mine 1
class Solution {
    LinkedList<TreeNode> stack = new LinkedList<>();
    boolean flag = false;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

            if(root.left != null){
                stack.add(root);
                inorderSuccessor(root.left, p);
            }

            if (root == p){
                flag = true;
            }

            if (root.right != null){

            }


    }
}


//mine 2
class Solution {
    boolean flag = false;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        if(root.left != null){
            inorderSuccessor(root.left, p);
        }

        if(flag == true){
            return root;
        }

        if (root == p){
            flag = true;
        }


        if (root.right != null){
            inorderSuccessor(root.right,p);
        }
        return; // need to return something??
    }
}
