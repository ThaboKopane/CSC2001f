// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
/**
* a node class, generic of course, that makes use of the BinaryTreeNode to create a node
* the other variable it references itself.
* @author Hussein Suleman
*/
public class BTQueueNode<dataType>
{
   BinaryTreeNode<dataType> node;
   BTQueueNode<dataType> next;
   public BTQueueNode ( BinaryTreeNode<dataType> n, BTQueueNode<dataType> nxt )
   {
      node = n;
      next = nxt;
   }
}
