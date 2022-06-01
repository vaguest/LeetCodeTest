package src;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
//        Q66();
        Q9();
//        String st = "1235";
//        System.out.println(st.length()-1);
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
}