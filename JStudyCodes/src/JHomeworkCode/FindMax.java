package JHomeworkCode;

import java.util.Scanner;

public class FindMax {
    private static void maxSubArraySum(int[] a) {
        int i, tmp = 0, max = 0, beg = 0, end = 0, s = 0;
        for (i = 0; i < a.length; i++) {
            max += a[i];

            if (tmp < max) {
                tmp = max;
                beg = s;
                end = i;
            }

            if (max < 0) {
                max = 0;
                s = i + 1;
            }
        }
        System.out.println("最大和是:" + tmp);
        System.out.println("子数组为:");
        for (i = beg; i <= end; ++i)
            System.out.println(a[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] num = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }
        maxSubArraySum(num);
    }
}