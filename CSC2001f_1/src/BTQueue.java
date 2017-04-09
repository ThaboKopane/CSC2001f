// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

/**
* This class makes use of both the BinaryTreeNode and BTQueueNode which also
* uses the BinaryTreeNode to make a Queue, which will be used to make the BinarySearchTree files.
* The head and tail of the queue are made by the BTQueueNode.
* @author Hussein Suleman
*/

public class BTQueue<dataType>
{
   BTQueueNode<dataType> head;
   BTQueueNode<dataType> tail;
  /**
  * This is a null, constructor, it takes in nothing.
  * The constructor initializes the variables to null
  */
   public BTQueue ()
   {
      head = null;
      tail = null;
   }
   /**
   * This method retrievs the front of the queue or BTQueue and returns it.
   * @return qnode.node of type BinaryTreeNode.
   */
   public BinaryTreeNode<dataType> getNext ()
   {
      if (head == null)
         return null;
      BTQueueNode<dataType> qnode = head;
      head = head.next;
      if ( head == null )
         tail = null;
      return qnode.node;
   }
   /**
   * This void method adds a BinaryTreeNode to the queue.
   * @param node , a BinaryTreeNode is added to the tree.
   */
   public void enQueue ( BinaryTreeNode<dataType> node )
   {
      if (tail == null)
      {
         tail = new BTQueueNode<dataType> (node, null);
         head = tail;
      }
      else
      {
         tail.next = new BTQueueNode<dataType> (node, null);
         tail = tail.next;
      }
   }
}
