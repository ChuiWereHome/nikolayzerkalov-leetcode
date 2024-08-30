package org.nikolayzerkalov;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
  /*
  https://leetcode.com/problems/two-sum/
   */
  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15, -23, 273};
    int target = 250;
    int[] expected = {4, 5};

    int[] actual = twoSum(nums, target);

    System.out.println(Arrays.equals(expected, actual));
  }


  private static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int expectedKey = target - nums[i];
      if (map.containsKey(expectedKey)) {
        return new int[]{map.get(expectedKey), i};
      }
      map.put(nums[i], i);
    }

    throw new IllegalArgumentException("No solution");
  }
}