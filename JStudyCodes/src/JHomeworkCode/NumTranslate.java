package JHomeworkCode;

import java.util.Scanner;

public class NumTranslate {
    private static String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] b = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] c = {"twenty", "thirty", "forty"};

    public static void main(String[] args) {
        System.out.println("输入英文单词或者数字，输入单字母q退出");
        Scanner in = new Scanner(System.in);
        String string;
        NumTranslate a = new NumTranslate();
        while (true) {
            string = in.nextLine();
            if (string.equals(":q")) break;
            if (a.CheckType(string) == 1) a.String2Num(string);
            if (a.CheckType(string) == 2) a.Num2String(string);
            if (a.CheckType(string) == 0) System.out.print("error");
            System.out.println("输入英文单词或者数字，输入单字母q退出");
        }
    }

    private int CheckType(String s) {//输入类型
        int flag = 0, j, i;
        for (j = 0; j < s.length(); j++) {//输入英文
            if ((s.charAt(j) == ' ') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')) {
                if (s.length() != (j + 1)) continue;
                else {
                    return flag = 1;
                }
            }
            break;
        }

        for (i = 0; i < s.length(); i++) {//输入数字
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.length() != (i + 1)) continue;
                else {
                    return flag = 2;
                }
            }
            break;
        }
        return flag;
    }

    private void Num2String(String s)//数字转英文
    {
        if (Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 50) {
            int num = Integer.parseInt(s);
            if (num < 10) System.out.println(a[num % 10]);
            else if (num < 20) System.out.println(b[num % 10]);
            else if (num > 20) System.out.println(c[num / 10 - 2] + " " + a[num % 10]);
        } else System.out.print("Error.");
    }

    private void String2Num(String s) {//英文转数字
        String s1 = null, s2 = null;
        int i, j, flag = -1;

        for (i = 0; i < s.length(); i++) {//词组1，单词0，用i标记空格位置
            if (s.charAt(i) == ' ') {
                flag = 1;
                break;
            } else flag = 0;
        }

        if (flag == 1) {
            s1 = s.substring(0, i);//空格位置分两个单词
            s2 = s.substring(i + 1, s.length());
            for (j = 0; j < 3; j++) {//匹配十位数
                if (s1.equals(c[j])) {
                    flag = 2;
                    break;
                }
            }
            if (flag == 2) {
                int k;
                for (k = 1; k < 10; k++) {//匹配个位数，如果成功则输出
                    if (s2.equals(a[k])) {
                        System.out.print(j + 2);
                        System.out.println(k);
                        flag = -1;
                        break;
                    }
                }
            }
        }
        if (flag == 0) {
            int l, k;
            for (l = 0; l < 10; l++) {//ab数组十个成员查询
                if (s.equals(a[l])) {
                    System.out.println(l);
                    flag = -1;
                    break;
                } else if (s.equals(b[l])) {
                    System.out.println(l + 10);
                    flag = -1;
                    break;
                }
            }
            for (k = 0; k < 3; k++) {//c数组三个成员查询
                if (s.equals(c[k])) {
                    System.out.println(k * 10 + 20);
                    flag = -1;
                    break;
                }
            }
        }
    }
}