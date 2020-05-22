package JHomeworkCode;

import java.util.Scanner;

public class FindMin {
    private static void minSubArraySum(int[] nums) {
        int i,tmp = 2147483647, min = 2147483647, beg = 0, end = 0, s = 0;
        for (i = 0; i < nums.length; i++) {
            if (min > 0) {
                min = nums[i];
                s = i;
            } else
                min += nums[i];
            if (tmp > min) {
                tmp = min;
                beg = s;
                end = i;
            }
        }
        System.out.println("最小和是：" + tmp);
        System.out.println("子数组为:");
        for (i = beg; i <= end; ++i)
            System.out.println(nums[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] num = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }
        minSubArraySum(num);
    }
}