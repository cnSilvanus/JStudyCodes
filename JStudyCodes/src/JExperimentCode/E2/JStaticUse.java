package JExperimentCode.E2;
/*
    Author:YuShiHui@2019/11/4-14:12
    Content:JStaticUse
*/

public class JStaticUse {
    static int a = 2;
    static int b;

    static {
        b = a * a;
        a = 3;
    }

    public static void main(String args[]) {
        JStaticUse s1 = new JStaticUse();
        System.out.println("b的值为 " + b);
        JStaticUse s2 = new JStaticUse();
        System.out.println("b的值现在为 " + b);
    }
}