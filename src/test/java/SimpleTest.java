import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.is;
public class SimpleTest {
  @Test
  @Tag("positive")
  void successtest() {
   assertEquals(true,true);
  }

  @Test
  void failedtest() {
    assertEquals(true,false);
  }

  @Test
  @Tag("positive")
  void successWithHamcrestTest() {
    assertThat(true, is(true));
  }

  @Test
  void failedWithHamcrestTest() {
    assertThat(true, is(false));
  }

  @Test
  @Tag("positive")
  @DisplayName("Some positive test")
  void successWithHamcrestTestAndSteps() {
    step("Assert that true is true",() ->
    assertThat(true, is(true)));
  }

  @Test
  @DisplayName("Some negative test")
  void failedWithHamcrestTestAndSteps() {
    step("Assert that true is false",() ->
    assertThat(true, is(false)));
  }
}
