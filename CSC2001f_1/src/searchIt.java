/**
* A main class of called searchIt, this class makes use of the ArrayList, from Java's util, and
*  the File and FileNotFoundException from Java's io.
* This class uses the humanBeing class and a BinarySearchTree;
* This class stores each extracted line as a humanBeing class, then the humanBeing is added to the BinarySearchTree
* then we search through the BinarySearchTree.
* @author Thabo Kopane
*/

import java.util.*;
import java.io.*;

public class searchIt{
  public static void main(String[] args){
    //Initialize an arrayList
    BinarySearchTree tree = new BinarySearchTree();
    try{
    //The first scanner is used to call the tesdata file, or the other multiple subsets.
    Scanner filing = new Scanner(new File("testdata"));
    //This scanner is used in the second while loop.
    Scanner scan = new Scanner(System.in);

    /*This while loop extracts data from testdata by line.
    *stores the contents of the line in an array.
    *stores each part of the array in a humanBeing(person) class
    *the person class then is inserted to the initialized BinarySearchTree.
    */
    while(filing.hasNextLine()){
      String hey = filing.nextLine();
      String[] detailed = hey.split("\\|");
      humanBeing human = new humanBeing(detailed[2], detailed[1], detailed[0]);
      tree.insert(human);
    }
    /*The following while makes use of the previous while loop.
    *searches through the tree to compare the object name and the name we have inputed,
    * wgich we then stored in a humanBeing class to compare the names of these people
    *prints out the name when found, prints an error when name not found.
    */
    while(scan.hasNextLine()){
      humanBeing person = new humanBeing(scan.nextLine(),"","");
      if(tree.find(person)==null)
        System.out.println("Error !!Name not found!!");
      else
        System.out.println(tree.find(person).data);
    }
  }
  /**
  * This catch statement, works with the try statement.
  * for file importing, it's important.
  */
  catch(FileNotFoundException err){
    System.err.println("File doesn't exist.");
  }
}
}
