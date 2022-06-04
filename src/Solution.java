package src;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{5, 212, 212, 1211};

    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = nums.length / 2;

        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }

        return 0;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String s = "" + x;
        int xLength = s.length();
        if (s.charAt(xLength - 1) != s.charAt(0))
            return false;
        int i, j;
        if (xLength % 2 == 0) {
            i = xLength / 2 - 1;
            j = i + 1;
            while (j < xLength) {
                if (s.charAt(i) == s.charAt(j)) {
                    i--;
                    j++;
                } else {
                    return false;
                }
            }
        } else {
            i = xLength / 2;
            j = i + 1;
            while (j < xLength) {
                if (s.charAt(--i) == s.charAt(j)) {
                    j++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int maximumWealth(int[][] accounts) {
        int xLength = accounts.length, yLength = accounts[0].length, sum = 0, tempMax = 0;
        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                sum += accounts[i][j];
            }
            if (sum > tempMax) {
                tempMax = sum;
            }
            sum = 0;
        }
        return tempMax;
    }

    public static final int[] plusOne(int[] digits) {
        int i = digits.length;
        while (digits[i - 1] != 9) {
            digits[i - 1] += 1;
        }

        return digits;
    }

    public static boolean isPalindrome2(int x) {
        if (x <= 0)
            return false;
        Integer a = Integer.valueOf(x);
        String st = a.toString();
        int left = 0, right = st.length() - 1;
        while (left < right) {
            if (st.charAt(left) != st.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static int[][] transpose(int[][] matrix) {
        int xLength = matrix[0].length, yLength = matrix.length;
        int[][] result = new int[xLength][yLength];
        for (int i = 0; i < yLength; ++i) {
            for (int j = 0; j < xLength; ++j) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static class NumMatrix {
        int[][] sums;

        public NumMatrix(int[][] matrix) {
            int xLength = matrix[0].length, yLength = matrix.length, i, j;
            if (yLength > 0) {
                sums = new int[yLength + 1][xLength + 1];
                for (i = 0; i < yLength; i++) {
                    for (j = 0; j < xLength; j++) {
                        sums[i + 1][j + 1] = sums[i][j + 1] + sums[i + 1][j] - sums[i][j] + matrix[i][j];
                    }
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sums[row2 + 1][col2 + 1] + sums[row1][col1] - sums[row2 + 1][col1] - sums[row1][col2 + 1];
        }
    }


    public static int totalSteps(int[] nums) {
        int n = nums.length, count = 0, i = 1, j = 1;
        boolean flag = false;
        int[] newNums = nums;
        while (!isNonDecrease(newNums, n)) {
            i = 1;
            j = 1;
            nums = newNums;
            while (i < n) {
                if (nums[i - 1] <= nums[i]) {
                    newNums[j++] = nums[i++];
                } else {
                    i++;
                }
            }
            n = j;
            count++;
        }
        return count;
    }

    public static boolean isNonDecrease(int[] array, int n) {
        int i = 0;
        while (i < n - 1) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
