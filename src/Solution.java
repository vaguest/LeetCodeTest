package src;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

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
        int ans = 0;
        var st = new ArrayDeque<int[]>();
        for (var num : nums) {
            var maxT = 0;
            while (!st.isEmpty() && st.peek()[0] <= num)
                maxT = Math.max(maxT, st.pop()[1]);
            maxT = st.isEmpty() ? 0 : maxT + 1;
            ans = Math.max(ans, maxT);
            st.push(new int[]{num, maxT});
        }
        return ans;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int L = m + n - 1, p1 = m - 1, p2 = n - 1;
        while (p1 > -1 || p2 > -1) {
            if (p1 == -1) {
                nums1[L--] = nums2[p2--];
            } else if (p2 == -1) {
                nums1[L--] = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                nums1[L--] = nums1[p1--];
            } else {
                nums1[L--] = nums2[p2--];
            }
        }

    }
}
