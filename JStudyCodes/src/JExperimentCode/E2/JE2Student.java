package JExperimentCode.E2;
/*
    Author:YuShiHui@2019/11/4-13:57
    Content:JE2Student
*/

class Student{
    String  name;   //姓名
    double score;   //成绩

    public Student(){
    }

    public Student(String name,double score){
        this.name = name;
        this.score = score;
    }

    void set(String name,double score){  //设值
        this.name   =   name;
        this.score  =   score;
    }

    void get(){ //获取
        System.out.println("姓名："+ name);
        System.out.println("成绩："+ score);
    }
}

public class JE2Student{
    public static void main(String[] args){
        Student A=new Student();
        A.set("余世辉（无参数）",100);
        A.get();
        Student B=new Student("余世辉（有参数）",100);
        B.get();
    }
}