import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
public class humanBeingTest{
  humanBeing person = new humanBeing("Reneilwe Kopane","","");
  @Test
  public void testgetName(){
    //Test the getName method
    humanBeing person_1 = new humanBeing("Thabo Kopane", "078-444-1666 (+27)", "flat 3A, Rosebridge, MainRoad.");
    assertEquals("Thabo Kopane", person_1.getName());
  }
  @Test
  public void testSetName(){
    //Test the setName method
    person.setName("Riyaadh Abrahams");
    assertFalse("Reneilwe Kopane".equals(person.getName()));
    assertEquals("Riyaadh Abrahams", person.getName());
  }
  @Test
  public void testSetNumber(){
    //Test the setNumber method
    person.setNumber("078-444-1666 (+27)");
    assertFalse("Reneilwe Kopane |0825996256 (+59) |".equals((person.toString())));
  }
  @Test
  public void testConstructor(){
    //Test  the constructor
    humanBeing human = new humanBeing("Thabo Kopane","082 599 5462 (27)", "Rosebridge, Main Road, Cape Town");
    assertEquals("Thabo Kopane", human.getName());
    Object personBeing = human;
    assertTrue(personBeing==human);
  }
  @Test
  public void testToString(){
    //Test the toString method
    person.setAddress("Church House, Rondebosch");
    person.setNumber("081 180 0972");
    assertTrue(person.toString().equals("Reneilwe Kopane |081 180 0972 |Church House, Rondebosch"));
  }
  @Test
  public void testCompareTo(){
    //Test the compareTo method
    humanBeing human = new humanBeing("Thabo Kopane","082 599 5462 (27)", "Rosebridge, Main Road, Cape Town");
    person.setName("Thabo Kopane");
    assertTrue(human.compareTo(person)==0);
  }
  @Test
  public void testEmptyString(){
    //Test the empty string.
    person.setName("");
    assertFalse(person.getName().equals("Reneilwe Kopane"));
  }
}
