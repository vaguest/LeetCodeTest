package src;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
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
        if (x<0)
            return false;
        String s=""+x;
        int xLength=s.length();
        if(s.charAt(xLength-1)!=s.charAt(0))
            return false;
        int i,j;
        if (xLength%2==0){
            i=xLength/2-1;
            j=i+1;
            while(j<xLength){
                if (s.charAt(i)==s.charAt(j)){
                    i--;
                    j++;
                }else {
                    return false;
                }
            }
        }else {
            i=xLength/2;
            j=i+1;
            while(j<xLength){
                if (s.charAt(--i)==s.charAt(j)){
                    j++;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static int maximumWealth(int[][] accounts) {
        int xLength =accounts.length,yLength = accounts[0].length,sum=0,tempMax=0;
        for (int i = 0; i<xLength;i++){
            for (int j = 0 ;j<yLength;j++){
                sum+=accounts[i][j];
            }
            if (sum>tempMax){
                tempMax=sum;
            }
            sum=0;
        }
        return tempMax;
    }

    public static final int[] plusOne(int[] digits){
        int i =digits.length;
        while (digits[i-1]!=9){
            digits[i-1]+=1;
        }

        return digits;
    }

    public static boolean isPalindrome2(int x) {
        if(x<=0)
            return false;
        Integer a = Integer.valueOf(x);
        String st = a.toString();
        int left=0,right=st.length()-1;
        while(left < right){
            if(st.charAt(left)!=st.charAt(right))
                return false;
            left ++;
            right --;
        }
        return true;
    }
}
