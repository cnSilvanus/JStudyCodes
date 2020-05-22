package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:28
    Content:JWordSort//实验第六题
*/

public class JWordSort {
    public static void main(String[] args) {
        String[] str = new String[]{"hello", "world", "welcome", "hi", "hey"};
        WordSort(str);

        for (int i = 0, k = str.length; i < k; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public static void WordSort(String[] ss) {
        String temp;
        for (int i = 0, k = ss.length - 1; i < k; i++) {
            for (int j = i + 1, n = k + 1; j < n; j++) {
                if (ss[i].compareTo(ss[j]) > 0) {
                    temp = ss[i];
                    ss[i] = ss[j];
                    ss[j] = temp;
                }
            }
        }
    }
}