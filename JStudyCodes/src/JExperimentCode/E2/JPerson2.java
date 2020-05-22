package JExperimentCode.E2;
/*
    Author:YuShiHui@2019/11/4-14:10
    Content:JPerson2
*/

public class JPerson2 {
    static String name = "王五";
    int age = 20;
    String country = "中国";

    public static String setName(String n) {
        name = n;
        return name;
    }

    public void setValue(int age, String country) {
        this.age = age;
        this.country = country;
    }
}