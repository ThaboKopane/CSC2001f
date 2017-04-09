// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman
// Thabo Kopane, addede the javadocs and the unit tests.
/**
* A generic Binary TreeNode that sets a node that is utilised by BTQueue node
* @author Hussein Suleman
*/
public class BinaryTreeNode<dataType>
{
   dataType data;
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   /**
    * The TreeNode constructor that initializes the variables and the branches
    * @param d depending on what dat one adds to the tree, the datatype needs to be uniform.
    * @param l the tree instantiates itself  here, the left child node.
    * @param r the tree instiates itself here, the right child node.
    */
   public BinaryTreeNode ( dataType d, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      left = l;
      right = r;
   }
   /**
   * This methods returns the left child of the tree.
   * @return left . returns the left node, if it exists.
   */
   BinaryTreeNode<dataType> getLeft () { return left; }
   /**
   * This method returns the right child of the tree
   * @return right . returns the right node, if it exists.
   */
   BinaryTreeNode<dataType> getRight () { return right; }
}
