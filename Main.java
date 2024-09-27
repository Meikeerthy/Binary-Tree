import java.util.*;

public class Main {
    public static void main(String[] args) {
      BinaryTree b=new BinaryTree();
      BinaryTree.Node n1=new BinaryTree.Node(28);
      BinaryTree.Node n2=new BinaryTree.Node(54);
      BinaryTree.Node n3=new BinaryTree.Node(92);
      BinaryTree.Node n4=new BinaryTree.Node(67);
      BinaryTree.Node n5=new BinaryTree.Node(35);

      n1.left=n2;
      
      n1.right=n3;
      n2.left=n4; 
      n3.right=n5;
      
      b.root=n1;
      
      b.printLevelOrder();
  }
}