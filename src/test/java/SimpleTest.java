import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
  @Test
  void successtest() {
   assertEquals(true,true);
  }

  @Test
  void failedtest() {
    assertEquals(true,false);
  }
}
