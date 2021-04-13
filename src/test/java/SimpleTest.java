import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
public class SimpleTest {
  @Test
  void successtest() {
   assertEquals(true,true);
  }

  @Test
  void failedtest() {
    assertEquals(true,false);
  }

  @Test
  void successWithHamcrestTest() {
    assertThat(true, is(true));
  }

  @Test
  void failedWithHamcrestTest() {
    assertThat(true, is(false);
  }
}
