package src;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {

    }


    public static String getType(Object test) {
        return test.getClass().getName().toString();

    }

    void Q704() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
    }

    static void Q9() {
        int x = 1001;
//        System.out.println(Solution.isPalindrome(x));
        System.out.println(Solution.isPalindrome2(x));
    }

    static void Q1672() {
        int[][] accounts = new int[][]{
                {1, 2, 3}, {3, 2, 1}
        };
        System.out.println(Solution.maximumWealth(accounts));
    }

    static void Q66() {
        int[] digits = new int[]{
                1, 2, 3
        };
        System.out.println(Arrays.toString(Solution.plusOne(digits)));
    }

    static void Q867() {
        int[][] matrix = {
                {1, 2, 3}, {4, 5, 6}
        };
        Solution.transpose(matrix);
    }

    static void Q304() {
//        int [][] matrix = {
//                {3,0,1,4,2},{5,6,3,2,1}, {1,2,0,1,5}, {4,1,0,1,7},{1,0,3,0,5}
//        };
        int[][] matrix = {
                {-1, -5}
        };
        new Solution.NumMatrix(matrix).sumRegion(0, 1, 0, 1);
    }

    static void Q2289() {
        int[] nums = {
                5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11
        };
//        System.out.println(Solution.totalSteps(nums));
        System.out.println(Solution.totalSteps(nums));
    }

    static void Q88() {
        int[] nums1 = {

        };
        int[] nums2 = {
                1
        };
        Solution.merge(nums1, 0, nums2, 1);
    }

    //2022.06.22 Daily Challenge
    //215.Kth Largest Element in an Array
    static void Q205(){
        int nums[] = {
                3,2,1,5,6,4
        };
        System.out.println(Solution.findKthLargest(nums,2));
    }
    // Slide Window
    static void Q1423(){
        int[] nums1 = {
                1,2,3,4,5,6,1
        };
        System.out.printf(String.valueOf(Solution.maxScore(nums1,3)));
    }

    static void Q1647(){
        String s = "ceabaacb";
        Solution.minDeletions(s);
    }

    static void Q462(){
        int[] nums = {
                1,0,0,8,6
        };
        System.out.println(Solution.minMoves2(nums));
    }

    static void Q1710(){
        int[][] boxTypes = {
                {5,10}, {2,5},{4,7},{3,9}
        };
        System.out.println(Solution.maximumUnits(boxTypes,10));
    }

    static void Q1465(){
        int[] horizontalCuts = {
            3,1,2
        };
        int[] verticalCuts = {
            1
        };
        System.out.println(Solution.maxArea(5,2,horizontalCuts,verticalCuts));
    }

    //https://leetcode.cn/problems/decode-the-message/
    static void Q2235(){
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(Solution.decodeMessage(key,message));
    }


    static void Q135(){
        int[] ratings ={
                1,0,2
        };
        System.out.println(Solution.candy(ratings));
    }

    static void Q128(){
        int[] nums = {
                100,4,200,1,3,2
        };
        System.out.println(Solution.longestConsecutive(nums)); //
    }

    static void Q729(){
        MyCalendar obj = new MyCalendar();
        System.out.println(obj.book(10,20));
        System.out.println(obj.book(5,10));
        System.out.println(obj.book(40,50));
        System.out.println(obj.book(25,35));
        System.out.println(obj.book(30,32));
    }



    static void Q2333(){
        int[] nums1 ={
                1,4,10,12
        };
        int[] nums2 ={
                5,8,6,9
        };
        System.out.println(Solution.minSumSquareDiff(nums1,nums2,1,1));
    }

    
    static void Q473(){
        int[] matchsticks = {
                5,5,5,5,16,4,4,4,4,4,3,3,3,3,4
        };
        System.out.println(Solution.makesquare(matchsticks));
    }


    static void Q735(){
        int[] asteroids ={
                -2,1,1,-1
        };
        System.out.println(Arrays.toString(Solution.asteroidCollision(asteroids)));

    }

    static void Q105(){
        int[] preorder = {
                3,9,20,15,7
        };
        int[] inorder = {
                9,3,15,20,7
        };
        System.out.println(Solution.buildTree(preorder,inorder));
    }

    static void Q2342(){
        int[] nums ={
                9,2,2,5
        };
        System.out.println(Solution.maximumSum(nums));
    }

    static void Q2343(){
        String[] nums = {
                "8331019423839036903","2215783497319194533","3244863164120264914","2723857887888553250","1069645833408356268","3799170975306313470","3300849027471666477","8896469467436127218","9595084104356246555","4601424390471226348","2777623221871959897","2660664761264162910","4830224756337097853","2239177595019260973","5704104074606481922","5158962343348888307","4957489822885409209","5533958195540658313","6712811206814843536","9775503283462317096","1975389311819120035","1292135637676764140","9838972337538013522","7609294617007602893","0186572359592634437","9236053726818307461","7264888050655615544","4990296885039745852","1417868535147288083"
        };
        int[][] queries ={
                {22,19},{16,17},{10,7},{27,16},{9,9},{21,4},{24,2},{12,11},{2,5},{24,12},{25,7},{7,13},{14,9},{23,15},{18,17},{22,16},{4,14},{14,17},{25,11},{12,16},{29,3},{22,11},{29,2},{24,2},{24,15},{7,14},{7,3},{7,14},{1,3}
        };
        System.out.println(Arrays.toString(Solution.smallestTrimmedNumbers(nums, queries)));
    }

    static void Q2344(){
        int[] nums = {
//                23
                4,3,6
        };
        int[] numsDivide = {
//                246399644,203707849,159778079,864526070,359022065,289963047,940593050,328283025,355738401
                8,2,6,10
        };
        System.out.println(Solution.minOperations(nums,numsDivide));
    }

}