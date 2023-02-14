import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestRandomMethods {

  @Test
  public void testGetTenRolls() {
    int[] rolls = getTenRolls();
    assertEquals(10, rolls.length);
    for (int roll : rolls) {
      assertTrue(roll >= 1 && roll <= 20);
    }
  }

  @Test
  public void testGetRandomLetter() {
    for (int i = 0; i < 100; i++) {
      char letter = getRandomLetter();
      assertTrue(letter >= 'a' && letter <= 'z');
    }
  }

  @Test
  public void testGeneratePassword() {
    String password = generatePassword();
    assertEquals(8, password.length());
    for (int i = 0; i < 8; i++) {
      assertTrue(password.charAt(i) >= 'a' && password.charAt(i) <= 'z');
    }
  }

  @Test
  public void testGetNewPasswordSet() {
    String[] passwords = getNewPasswordSet(5);
    assertEquals(5, passwords.length);
    for (String password : passwords) {
      assertEquals(8, password.length());
      for (int i = 0; i < 8; i++) {
        assertTrue(password.charAt(i) >= 'a' && password.charAt(i) <= 'z');
      }
    }
  }

}
