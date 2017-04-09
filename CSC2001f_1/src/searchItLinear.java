/**
* A main class of called searchItLinear, this class makes use of the ArrayList, from Java's util, and
*  the File and FileNotFoundException from Java's io.
* this class takes in data from a textfile and command, through a scanner, so thatone can search through it using a key.
* This class uses the humanBeing class to store files within the humanBeing and then store that object in an ArrayList.
* @author Thabo Kopane
*/

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
public class searchItLinear{
    public static void main(String[] args){
  /*
  * this starts with a try because a file has to be read, so its Error handling method
  * for when the file cannot be found.
  */
      try{
          Scanner newFile = new Scanner(new File("testdata"));
          List<humanBeing> people = new ArrayList<humanBeing>();

          /*
          * this while loop takes the testdata (mainly) as an input,
          * extracts each line individually and split according to the verticall slash
          * the split files are then added to a an array, then a humanBeing class is instantiated.
          * then it makes use of the arraylist to add each individual humanBeing object
          */
          while(newFile.hasNextLine()){
            String find = newFile.nextLine();
            String[] details = find.split("\\|");
            humanBeing human = new humanBeing(details[2], details[1], details[0]);
            people.add(human);
          }

              newFile = new Scanner(System.in);
            /*
            *This while loop cannot exist without the above while loop,
            *this creates a person class and stores a name and empty string for address and phoneNumber.
            *A for-loop is used to traverse through an arraylist and compare the names and print the answers
            *or print name not found.
            */
              while(newFile.hasNextLine()){
                boolean count = false;
                humanBeing testHuman = new humanBeing(newFile.nextLine(),"","");
                for (int i=0; i<people.size(); i++){
                  if(people.get(i).compareTo(testHuman)==0){
                      System.out.println(people.get(i));
                      count = true;}
              }
              if(count ==false){
                System.out.println("Name not found");
              }
          }
      }
      catch(FileNotFoundException ere){
        System.err.println("Something must be wrong, because as far as I am concerned: I can't find the file");
      }
    }
}
