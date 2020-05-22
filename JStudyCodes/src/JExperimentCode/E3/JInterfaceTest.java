package JExperimentCode.E3;
/*
    Author:YuShiHui@2019/11/10-9:46
    Content:JInterfaceTest
*/

public class JInterfaceTest {
    public static void main(String[] args) {
        Student stu = new Student("余世辉","201603090227");
        Teacher tea = new Teacher("张三", "10086");
        System.out.println("接口测试：");
        System.out.println(stu.output());
        System.out.println(tea.output());
        System.out.println("类测试：");
        Student[] stuArray = new Student[5];
        int sID= 20160000;
        int tID= 10086;
        char sName = 'A';
        for (int i = 0; i < 5; i++) {
            sID++;
            ++sName;
            String sId = String.valueOf(sID);
            String sNa = String.valueOf(sName);
            stuArray[i] = new Student(sNa,sId);
            System.out.println(stuArray[i].output());
        }
        Teacher[] teaArray = new Teacher[3];
        for (int i = 0; i < 3; i++) {
            tID++;
            ++sName;
            String tId = String.valueOf(tID);
            String tNa = String.valueOf(sName);
            teaArray[i] = new Teacher(tNa,tId);
            System.out.println(teaArray[i].output());
        }
    }
}

interface IPerson {
    //int sId = JInterfaceTest.sID;
    public String getName();
    public String setName(String name);
}

class Student implements IPerson {
    String name;
    String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public Student() {
        this.name = "";
        this.studentID = "0000000";
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String output() {
        return "学生信息:" + "姓名：" + name + " 学号：" + studentID;
    }
}

class Teacher implements IPerson {
    String name;
    String teacherID;

    public Teacher(String name, String teacherID) {
        this.name = name;
        this.teacherID = teacherID;
    }

    public Teacher() {
        this.name = "";
        this.teacherID = "0000000";
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String output() {
        return "教师信息:" + "姓名：" + name + " 工号：" + teacherID;
    }
}