// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
/**
* This is a BinaryTree class that has a BinaryTreeNode as a variable.
* These classes are all in the same package, and thus do not need to be private.
* @author Hussein Suleman
*/
public class BinaryTree<dataType>
{
   BinaryTreeNode<dataType> root;
   /**
   * A constructor that doesnt have any parameters,
   * initializes the root variable to null.
   */
   public BinaryTree ()
   {
      root = null;
   }
   /**
   * This method returns the height of the tree when it's just the root.
   * @return a recursive call on itself, ultimately an int is returned.
   */
   public int getHeight ()
   {
      return getHeight (root);
   }
   /**
   * This method returns thr height of the tree, works with the previous method.
   * @return an int ultimately, but it starts by returning a recursive call.
   */
   public int getHeight ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }

   public int getSize ()
   {
      return getSize (root);
   }
   public int getSize ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }

   public void visit ( BinaryTreeNode<dataType> node )
   {
      System.out.println (node.data);
   }

   public void preOrder ()
   {
      preOrder (root);
   }
   public void preOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }
   }

   public void postOrder ()
   {
      postOrder (root);
   }
   public void postOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         postOrder (node.getLeft ());
         postOrder (node.getRight ());
         visit (node);
      }
   }

   public void inOrder ()
   {
      inOrder (root);
   }
   public void inOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         inOrder (node.getLeft ());
         visit (node);
         inOrder (node.getRight ());
      }
   }

   public void levelOrder ()
   {
      if (root == null)
         return;
      BTQueue<dataType> q = new BTQueue<dataType> ();
      q.enQueue (root);
      BinaryTreeNode<dataType> node;
      while ((node = q.getNext ()) != null)
      {
         visit (node);
         if (node.getLeft () != null)
            q.enQueue (node.getLeft ());
         if (node.getRight () != null)
            q.enQueue (node.getRight ());
      }
   }
}
