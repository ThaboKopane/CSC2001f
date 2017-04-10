/**
* A main class of called printIt, this class makes use of the File and FileNotFoundException from Java's io
* this class takes in data from a textfile and command, through a scanner.
* The most important aspect of this class is that it makes and instant of a BinarySearchTree and print out the items
* of the tree in order./ or traverse through the list and print stuff out.
* @author Thabo Kopane
*/


import java.util.Scanner;
import java.util.*;
import java.io.*;
public class printIt{
  public static void main(String[] args){
    //A BinarySearchTree is initialized
    BinarySearchTree tree = new BinarySearchTree();
    try{
      Scanner filing = new Scanner(new File("testdata"));
      /*The most important applet of this application.
      *this while loop extracts tesdata content, line by line
      *then the line in split into an array.
      *The contents of the array are extracted and then added to a humanBeing object.
      * the humanBeing object is then inserted to a tree.
      */
      while(filing.hasNextLine()){
        String line = filing.nextLine();
        String[] detailed = line.split("\\|");
        humanBeing human = new humanBeing(detailed[2],detailed[1],detailed[0]);
        tree.insert(human);
      }
      tree.inOrder();
      }
    catch(FileNotFoundException err){
      System.err.println("you have an error, sir");
    }
  }
}
