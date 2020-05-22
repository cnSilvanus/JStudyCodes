package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:18
    Content:JStringTest//实验第四题
*/

public class JStringTest {
    public static void main(String[] args) {
        String s = "HelloWorld";
        char[] ch = s.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                buffer.append(String.valueOf(ch[i]).toLowerCase());
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                buffer.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(buffer.toString());
    }
}