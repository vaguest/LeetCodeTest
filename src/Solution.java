package src;


import com.sun.jdi.Value;
import org.w3c.dom.ls.LSException;
import src.test.resources.TreeNode;

import java.math.BigInteger;
import java.util.*;

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

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        int i = 0, len = nums.length;
        for (int num : nums) {
            if (heap.size() < k)
                heap.add(num);
            else if (heap.peek() < num) {
                heap.poll();
                heap.add(num);
            }
        }
        return heap.poll();
    }

    public static int maxScore(int[] cardPoints, int k) {
        int sum = Arrays.stream(cardPoints).sum();
        if (cardPoints.length == k)
            return sum;
        int i = 0, windowSize = cardPoints.length - k, windowSum = 0, len = cardPoints.length, res = 0;
        while (i < windowSize)
            windowSum += cardPoints[i++];
        i = windowSize;
        res = sum - windowSum;
        while (i < len) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            res = Math.max(res, sum - windowSum);
            i++;
        }
        return res;
    }

    public static int minDeletions(String s) {
        int res = 0;
        //将字符串转化为字符数组
        char[] chars = s.toCharArray();
        //创建一个HashMap名为hm
        HashMap<Character, Integer> hm = new HashMap();

        //定义一个字符串c，循环遍历遍历chars数组
        for (char c : chars)
            hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);

        for (Character key : hm.keySet()) {
            //hm.keySet()代表所有键的集合,进行格式化输出
            System.out.println(key + "====" + hm.get(key));
        }


        return res;
    }

    public static int minMoves2(int[] nums) {
        double res = 0, mid;
        Arrays.sort(nums);
        mid = nums[nums.length / 2];
        for (double i : nums)
            res += Math.abs(i - mid);
        return (int) res;
    }

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0, i = 0, numberOfBoxesi, numberOfUnitsPerBoxi;
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        while (truckSize > 0 && i < boxTypes.length) {
            numberOfBoxesi = boxTypes[i][0];
            numberOfUnitsPerBoxi = boxTypes[i][1];
            if (numberOfBoxesi > truckSize) {
                res += truckSize * numberOfUnitsPerBoxi;
                truckSize = 0;
            } else {
                res += numberOfUnitsPerBoxi * numberOfBoxesi;
                truckSize -= numberOfBoxesi;
            }
            i++;
        }
        return res;
    }

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long res, height, weight;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        if (horizontalCuts.length == 1) {
            height = Math.max(horizontalCuts[0], h - horizontalCuts[0]);
        } else if (horizontalCuts.length == 0) {
            height = h;
        } else {
            height = maxArea_MaxDifference(h, horizontalCuts);
        }
        if (verticalCuts.length == 1) {
            weight = Math.max(verticalCuts[0], w - verticalCuts[0]);
        } else if (verticalCuts.length == 0) {
            weight = w;
        } else {
            weight = maxArea_MaxDifference(w, verticalCuts);
        }
        res = height * weight % 1000000007;
        return (int) res;
    }

    public static long maxArea_MaxDifference(int d, int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i] - nums[i - 1], max);
        }
        max = Math.max(max, d - nums[nums.length - 1]);
        return max;
    }

    public static String decodeMessage(String key, String message) {
        return "";
    }

    public static int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        int[] right = new int[len];

        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < len; i++)
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
        int res = left[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                right[i] = right[i + 1] + 1;
            res += Math.max(left[i], right[i]);
        }

        return res;
    }

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int res = 0, tmp;
        for (int num : nums)
            hashSet.add(num);

        for (int num : hashSet) {
            tmp = num;
            if (!hashSet.contains(tmp - 1))
                while (hashSet.contains(tmp + 1))
                    tmp++;
            res = Math.max(res, tmp - num + 1);
        }
        return res;
    }

    public static long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[][] diffNums = new int[nums1.length][3];
        long res = 0;
        for (int i = 0; i < nums1.length; i++) {
            diffNums[i][0] = i;
            diffNums[i][1] = nums1[i] - nums2[i];
            diffNums[i][2] = Math.abs(diffNums[i][1]);
        }
        showArray(diffNums);
        System.out.println("-----");
        Arrays.sort(diffNums, Comparator.comparingInt(t0 -> t0[2]));
        showArray(diffNums);

        for (int i = 0; i < diffNums.length; i++) {
            if (diffNums[i][2] == 0)
                continue;
            else if (diffNums[i][1] < 0) {
                if (k1 > 0) {
                    diffNums[i][1] = 0;
                }
            }
            if (k1 > 0) {
                if (nums1[i] < nums2[i]) {
                    diffNums[i][1] = 0;
                    k1 -= nums1[i];
                } else {
                    diffNums[i][1] -= k1;
                    k1 = 0;
                }
            } else if (k2 > 0) {
                if (nums2[i] <= k2) {
                    diffNums[i][1] = 0;
                    k2 -= nums2[i];
                } else {
                    diffNums[i][1] -= k2;
                    k2 = 0;
                }
            } else
                break;
        }

        for (int i = 0; i < diffNums.length; i++) {
            res += ((long) diffNums[i][1] * diffNums[i][1]);
        }
        return res;

    }

    public static void showArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }


    public static boolean canChange(String start, String target) {
        int len = start.length();
        StringBuilder t1 = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (target.charAt(i) == 'L')
                t1.append('L');
            else if (target.charAt(i) == 'R')
                t1.append('R');

            if (start.charAt(i) == 'L')
                s1.append('L');
            else if (start.charAt(i) == 'R')
                s1.append('R');
        }

        if (!s1.toString().equals(t1.toString()))
            return false;

        for (int i = 0; i < len; i++) {
            if (start.charAt(i) != target.charAt(i)) {
                if (start.charAt(i) == 'L') {
                    if (i != 0 && start.charAt(i - 1) != '_')
                        return false;
                } else if (start.charAt(i) == 'R') {
                    if (i != len - 1 && start.charAt(i + 1) != '_')
                        return false;
                    if (i == len - 1)
                        return false;
                }
            }
        }
        return true;
    }

    public static boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4)
            return false;
        int sum = Arrays.stream(matchsticks).sum();
        if (sum % 4 != 0)
            return false;
        int edge = sum / 4;
        Arrays.sort(matchsticks);

        for (int i = 0; i < matchsticks.length / 2; i++) {   //原数组元素交换实现降序排列
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[matchsticks.length - 1 - i];
            matchsticks[matchsticks.length - 1 - i] = temp;
        }

        if (matchsticks[0] > edge)
            return false;
        int[] bucket = new int[4];

        return back_tracking(0, matchsticks, edge, bucket);
    }

    public static boolean back_tracking(int i, int[] matchsticks, int edge, int[] bucket) {
        if (i >= matchsticks.length)
            return true;
        for (int j = 0; j < 4; j++) {
            if (bucket[j] + matchsticks[i] > edge)
                continue;
            bucket[j] += matchsticks[i];
            if (back_tracking(i + 1, matchsticks, edge, bucket))
                return true;
            bucket[j] -= matchsticks[i];
        }
        return false;
    }

//    public static class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new ArrayDeque<>();
        int queSize;
        TreeNode p;
        List<Integer> tmp = new ArrayList<Integer>();


        if (root == null)
            return res;

        que.offer(root);

        while (!que.isEmpty()) {
            queSize = que.size();
            while (queSize > 0) {
                p = que.poll();
                tmp.add(p.val);
                if (p.left != null)
                    que.offer(p.left);
                if (p.right != null)
                    que.offer(p.right);
                queSize--;
            }
            res.add(tmp);
        }
        return res;
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        for (int i : asteroids) {
            while (flag && !stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (stack.peek() < -i)
                    stack.pop();
                else if (stack.peek() == -i) {
                    stack.pop();
                    flag = false;
                } else
                    flag = false;
            }
            if (flag)
                stack.push(i);
            flag = true;

        }
        int size = stack.size();
        int[] res = new int[size];
        while (!stack.isEmpty())
            res[--size] = stack.pop();
        return res;
    }

    private void check(int asteroid, Stack<Integer> stack) {
        while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
            if (stack.peek() < -asteroid) {
                stack.pop();
                continue;
            }
            if (stack.peek() == -asteroid) {
                stack.pop();
            }
            return;
        }
        stack.push(asteroid);
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 1)
            return new TreeNode(preorder[0]);

        return build(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public static TreeNode build(int[] preorder, int preBegin, int preEnd, int[] inorder, int inBegin, int inEnd) {
        if (preBegin == preEnd)
            return null;
        int rootVal = preorder[preBegin];
        TreeNode root = new TreeNode(rootVal);

        if (preEnd - preBegin == 1)
            return root;
        int i;
        for (i = inBegin; i < inEnd; i++)
            if (inorder[i] == rootVal)
                break;

        int leftInBegin = inBegin;
        int leftInEnd = i;

        int rightInBegin = i + 1;
        int rightInEnd = inEnd;

        int leftPreBegin = preBegin + 1;
        int leftPreEnd = i + preBegin + 1 - inBegin;

        int rightPreBegin = preBegin + 1 + (i - inBegin);
        int rightPreEnd = preEnd;

        root.left = build(preorder, leftPreBegin, leftPreEnd, inorder, leftInBegin, leftInEnd);
        root.right = build(preorder, rightPreBegin, rightPreEnd, inorder, rightInBegin, rightInEnd);

        return root;
    }

    public class MovingAverage {

        /**
         * Initialize your data structure here.
         */
        int size, sum;
        LinkedList<Integer> data = new LinkedList<>();

        public MovingAverage(int size) {
            this.size = size;
            this.sum = 0;

        }

        public double next(int val) {
            data.offer(val);
            sum += val;

            if (data.size() > size)
                sum -= data.poll();

            return sum / (double) data.size();
        }
    }

    public static int[] numberOfPairs(int[] nums) {
        if (nums.length == 1)
            return new int[]{0, 1};
        int[] res = {0, 0};
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                res[0]++;
                i += 2;
                if (i == nums.length - 1) {
                    res[1]++;
                }
            } else {
                res[1]++;
                i++;
                if (i == nums.length - 1) {
                    res[1]++;
                }
            }
        }

        return res;
    }

    public static int maximumSum(int[] nums) {
        int res = -1, len = nums.length, i;
        int[][] tmp = new int[len][2];
        List<Integer> tmp2 = new ArrayList<>();
        int[] tmp3;
        for (i = 0; i < len; i++) {
            int x = nums[i];
            int s = 0;
            while (x != 0) {
                s += x % 10;
                x = x / 10;
            }
            tmp[i][1] = s;
            tmp[i][0] = nums[i];
        }
        Arrays.sort(tmp, Comparator.comparingInt(t0 -> t0[1]));
        for (i = len - 1; i > 0; i--) {
            tmp2.clear();
            tmp3 = new int[]{};
            if (tmp[i][1] == tmp[i - 1][1]) {
                while (i > 0 && tmp[i][1] == tmp[i - 1][1]) {
                    tmp2.add(tmp[i][0]);
                    i--;
                }
                tmp2.add(tmp[i][0]);
                tmp3 = tmp2.stream().mapToInt(Integer::intValue).toArray();
                Arrays.sort(tmp3);
                res = Math.max(tmp3[tmp3.length - 1] + tmp3[tmp3.length - 2], res);
                i--;

            }
        }

        return res;
    }

    public static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        BigInteger[][] list = new BigInteger[nums.length][2];
        ArrayList<BigInteger> resList = new ArrayList<>();
        int len = nums[0].length();
        for (int[] query : queries) {
            for (int j = 0; j < nums.length; j++) {
                list[j][1] = new BigInteger(nums[j].substring(len - query[1]));
                list[j][0] = new BigInteger(String.valueOf(j));
            }
            Arrays.sort(list,Comparator.comparing(t0 -> t0[1]));
            resList.add(list[query[0] - 1][0]);
        }
        return resList.stream().mapToInt(BigInteger::intValue).toArray();
    }

    public static int minOperations(int[] nums, int[] numsDivide) {
        int res = 0, count = 1, j = 0, k = 0;
        Arrays.sort(nums);
        Arrays.sort(numsDivide);
        List<Integer> notRepNums = new ArrayList<>();
        List<Integer> notRepNumsDivide = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                notRepNums.add(nums[i - 1]);
                numbers.add(count);
                count = 1;
            }
            if (i == nums.length - 1) {
                notRepNums.add(nums[i]);
                numbers.add(count);
            }
        }
        for (int i = 1; i < numsDivide.length; i++) {
            if (numsDivide[i] != numsDivide[i - 1])
                notRepNumsDivide.add(numsDivide[i - 1]);
            if (i == numsDivide.length - 1 && numsDivide[i] != numsDivide[i - 1])
                notRepNumsDivide.add(numsDivide[i]);
        }

        boolean flag = true;
        while (k < notRepNums.size()) {
            j = 0;
            while (j < notRepNumsDivide.size()) {
                if (notRepNumsDivide.get(j) % notRepNums.get(k) != 0) {
                    if (res == 0)
                        res = numbers.get(k);
                    else
                        res += numbers.get(k);
                    flag = false;
                    break;
                }
                j++;
            }
            k++;
            if (j == notRepNumsDivide.size()) {
                return res;
            }
        }
        if (flag)
            return res;
        else
            return -1;
    }

}
