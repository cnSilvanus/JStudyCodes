package JExperimentCode.E1;
/*
    Author:YuShiHui@2019/10/21-14:16
    Content:JBufferedReader
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JBufferedReader {
    public static void main(String[] args) throws IOException
    {
        String ss;
        int a;
        BufferedReader buf = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("请输入一个数：");
        ss = buf.readLine();
        a = Integer.parseInt(ss);
        System.out.println("输入的数为：" + a);
    }
}
