import static org.junit.Assert.*;
import junit.framework.*;
import java.util.Iterator;
import org.junit.Test;
import org.junit.Assert;

public class BTQueueTest{
  BTQueue<Integer> queenB = new BTQueue<Integer>();

  @Test
  public void testConstructor(){
    AssertTrue(queenB==null);
  }
  @Test
  public void testGetNode(){
    Assert(null, queenB.getNext());
  }
  @Test
  public void testEnqueue(){
    queenB.enQueue(10);
    queenB.enQueue(4);
    assertFalse(queenB==null);
  }
}
