package JExperimentCode.E3;
/*
    Author:YuShiHui@2019/11/10-9:28
    Content:JAbstractClassTest
*/

public class JAbstractClassTest {
    public static void main(String[] args) {
        Teacher2 teacher = new Teacher2("10086", "信息", "张三", '男', 30, 50.0, 172.0);
        System.out.println(teacher.output());
        System.out.println(teacher.output("10086"));
    }
}

abstract class JPersonAbstract {
    String name;
    char sex;
    int age;
    double weight;
    double height;

    //获取
    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    abstract public String getName();

    abstract public double getHeight();

    abstract public double getWeight();

    //设定
    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    abstract public void setHeight(double height);

    abstract public void setName(String name);

    abstract public void setWeight(double weight);

    //输出
    abstract public String output();

    abstract public String output(String name);
}

class Teacher2 extends JPersonAbstract {
    String teacherID;
    String department;

    public Teacher2() {
    }

    public Teacher2(String teacherID, String department, String name, char sex, int age, double weight, double height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.teacherID = teacherID;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String output() {
        return "姓名：" + this.name + " " + "工号:" + this.teacherID + " " + "年龄:" + this.age;
    }

    public String output(String teacherID) {
        String str = "姓名：" + this.name + " " + "工号:" + this.teacherID + " " + "年龄:" + this.age;
        return str;
    }

    public double getWeight() {
        return super.weight;
    }

    public void setWeight(double weight) {
        super.weight = weight;
    }

    public double getHeight() {
        return super.height;
    }

    public void setHeight(double height) {
        super.height = height;
    }
}