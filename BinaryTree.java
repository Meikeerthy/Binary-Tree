import java.util.*;
public class BinaryTree {
  public static class Node{
    public int data;
    public Node left;
    public Node right;
    
    public Node(int value){
      data=value;
    }
  }public Node root;  
  
  public void printLevelOrder(){
    ArrayList<Node> list=new ArrayList<>();
    list.add(root);
    while(list.size()>0){
      Node node = list.remove(0);
      System.out.print(node.data+" ");
      if(node.left!=null){
        list.add(node.left);
      }
      if(node.right!=null){
        list.add(node.right);
      }   
    }
  }

}