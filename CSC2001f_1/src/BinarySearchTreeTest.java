// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

public class BinarySearchTreeTest
{
   public static void main ( String [] args )
   {
      BinarySearchTree<String> bt = new BinarySearchTree<String> ();

/*
      // test for single node
      bt.root = new BinaryTreeNode<Integer> (10, null, null);
*/

/*
      // test for 2-level tree
      bt.root = new BinaryTreeNode<Integer> (
          1,
          new BinaryTreeNode<Integer> (2, null, null),
          new BinaryTreeNode<Integer> (3, null, null)
      );
*/


      // test for 3-level tree
      bt.insert ("Vlad");
      bt.insert ("france");
      bt.insert ("alice");
      bt.insert ("Muchi");
      bt.insert ("Winile");
      bt.insert ("Sheba");
      bt.insert ("Riyaadh");
      bt.insert ("Mikhail");
      bt.insert ("Fabio");

/*
                   5
            1             7
                2      6     9
                  4        8
                 3
*/
      System.out.println ("Inorder : ");
      bt.inOrder ();

      System.out.println ("Search alice : ");
      System.out.println (bt.find ("alice"));
      System.out.println ("Search 7 : ");
      System.out.println (bt.find ("Riyaadh"));
      System.out.println ("Search 5 : ");
      System.out.println (bt.find ("Fabio"));
      System.out.println ("Search 3 : ");
      System.out.println (bt.find ("Thabo"));
      System.out.println ("Search 10 : ");
      System.out.println (bt.find ("Sheba"));

      System.out.println ("Delete 2 : ");
      bt.delete ("Riyaadh");
      bt.inOrder ();
      /*System.out.println ("Delete 7 : ");
      bt.delete (7);
      bt.inOrder ();
      System.out.println ("Delete 5 : ");
      bt.delete (5);
      bt.inOrder ();
      System.out.println ("Delete 3 : ");
      bt.delete (3);
      bt.inOrder ();
      System.out.println ("Delete 10 : ");
      bt.delete (10);
      bt.inOrder ();*/
   }
}
