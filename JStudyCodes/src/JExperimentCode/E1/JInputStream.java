package JExperimentCode.E1;
/*
    Author:YuShiHui@2019/10/21-14:14
    Content:JInputStream
*/

import java.io.IOException;

public class JInputStream {
    public static void main(String[] args) throws IOException
    {
        byte[] b = new byte[100];
        int count = System.in.read(b);
        for (int i = 0; i <= count - 1; i++)
            System.out.print((char) b[i]);
    }
}
