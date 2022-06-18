package src;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
//        Q66();
//        Q9();
//        String st = "1235";
//        System.out.println(st.length()-1);
//        Q867();
//        Q2289();
        Q88();
    }
    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }

    void Q704(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
    }

    static void Q9(){
        int x =1001;
//        System.out.println(Solution.isPalindrome(x));
        System.out.println(Solution.isPalindrome2(x));
    }

    static void Q1672(){
        int[][] accounts=new int[][]{
                {1,2,3}, {3,2,1}
        };
        System.out.println(Solution.maximumWealth(accounts));
    }

    static void Q66(){
        int[] digits=new int[]{
                1,2,3
        };
        System.out.println(Arrays.toString(Solution.plusOne(digits)));
    }

    static void Q867(){
        int [][] matrix = {
            {1, 2, 3},{4, 5, 6}
        };
        Solution.transpose(matrix);
    }

    static void Q304(){
//        int [][] matrix = {
//                {3,0,1,4,2},{5,6,3,2,1}, {1,2,0,1,5}, {4,1,0,1,7},{1,0,3,0,5}
//        };
        int [][] matrix = {
                {-1,-5}
        };
        new Solution.NumMatrix(matrix).sumRegion(0,1,0,1);
    }

    static void Q2289(){
        int[] nums = {
                5,3,4,4,7,3,6,11,8,5,11
        };
//        System.out.println(Solution.totalSteps(nums));
        System.out.println(Solution.totalSteps(nums));
    }

    static void Q88(){
        int[] nums1 = {

        };
        int[] nums2 = {
                1
        };
        Solution.merge(nums1,0,nums2,1);
    }
}