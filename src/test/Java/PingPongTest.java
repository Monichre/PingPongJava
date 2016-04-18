import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {


  @Test
  public void listPingPong_isArrayOneToNumber_true() {
    PingPong testping = new PingPong();
    ArrayList<Object> expected = new ArrayList<Object>();
    expected.add(0);
    expected.add(1);
    expected.add(2);
    assertEquals(expected, testping.listPingPong(2));
  }
}
