package JExperimentCode.E3;
/*
    Author:YuShiHui@2019/11/10-8:53
    Content:JClassTest
*/

public class JClassTest {
    public static void main(String[] args) {
        JPerson person = new JPerson("余世辉", '男', 21, 59.9, 172.0);
        JPerson teacher = new JTeacher("1103", "信息", "张三", '男', 30, 50.0, 172.0);
        System.out.println(person.output());
        System.out.println(person.output("余世辉"));
        System.out.println(teacher.output());
        System.out.println(teacher.output("张三"));
    }
}

class JPerson {
    String name;
    char sex;
    int age;
    double height;
    double weight;

    public JPerson() {
    }

    public JPerson(String name, char sex, int age, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //获取
    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    //设定
    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //输出
    public String output() {
        return "人：" + this.name + "," + "年龄" + this.age;
    }

    public String output(String name) {
        String str = "人：" + this.name;
        return str;
    }
}

class JTeacher extends JPerson {
    String teacherID;
    String department;

    public JTeacher() {
        super();
    }

    public JTeacher(String teacherID, String department, String name, char sex, int age, double height, double weight) {
        super(name, sex, age, weight, height);
        this.teacherID = teacherID;
        this.department = department;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    //输出
    public String output() {
        return "教师姓名：" + this.name + "," + "年龄" + this.age;
    }

    public String output(String name) {
        String str = "" + ("教师姓名：" + this.name);
        return str;
    }
}