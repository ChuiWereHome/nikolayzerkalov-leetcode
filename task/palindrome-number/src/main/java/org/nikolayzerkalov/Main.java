package org.nikolayzerkalov;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Main {
  public static void main(String[] args) {
    boolean expected;

    expected = TRUE.equals(isPalindrome(143777341));
    System.out.println(expected);

    expected = FALSE.equals(isPalindrome(-45554));
    System.out.println(expected);

    expected = TRUE.equals(isPalindrome(345999543));
    System.out.println(expected);
  }

  private static boolean isPalindrome(int n) {
    int reverse = 0;
    int temp = n;

    if (n < 0) {
      return false;
    }

    while (temp != 0) {
      int remainder = temp % 10;
      reverse = reverse * 10 + remainder;
      temp = temp / 10;
    }

    return reverse == n;
  }
}