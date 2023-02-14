import java.util.Random;
public class Main {

  private static final int LOWER_BOUND = 1;
  private static final int UPPER_BOUND = 20;
  private static final int PASSWORD_LENGTH = 8;
  private static final char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public int[] getTenRolls() {
    int[] rolls = new int[10];
    Random randMachine = new Random();
    for (int i = 0; i < rolls.length; i++) {
      rolls[i] = randMachine.nextInt(UPPER_BOUND - LOWER_BOUND + 1) + LOWER_BOUND;
    }
    return rolls;
  }

  public char getRandomLetter() {
    Random randMachine = new Random();
    int randomIndex = randMachine.nextInt(ALPHABET.length);
    return ALPHABET[randomIndex];
  }

  public String generatePassword() {
    StringBuilder password = new StringBuilder();
    for (int i = 0; i < PASSWORD_LENGTH; i++) {
      password.append(getRandomLetter());
    }
    return password.toString();
  }

  public String[] getNewPasswordSet(int length) {
    String[] passwordSet = new String[length];
    for (int i = 0; i < passwordSet.length; i++) {
      passwordSet[i] = generatePassword();
    }
    return passwordSet;
  }
}
