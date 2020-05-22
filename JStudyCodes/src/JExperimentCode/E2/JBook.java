package JExperimentCode.E2;
/*
    Author:YuShiHui@2019/11/4-13:35
    Content:JBook
*/

public class JBook {
    public int id; // 书的编号
    public static int bookNumber = 0; // 书的总数

    public JBook() {
        ++bookNumber;
    }// JBook构造方法结束

    public void info() {
        System.out.println("当前书的编号是：" + id);
    } // 方法info结束

    public static void infoStatic() {
        System.out.println("书的总数是：" + bookNumber);
    } // 静态方法引用静态变量

    public static void main(String args[]) {
        JBook a = new JBook();
        JBook b = new JBook();
        a.id = 1101;
        b.id = 1234;
        System.out.print("变量a对应的");
        a.info();
        System.out.print("变量b对应的");
        b.info();
        JBook.infoStatic();
        System.out.println("比较(a.bookNumber==Book.bookNumber)" + "的结果是："
                + (a.bookNumber == JBook.bookNumber));
        System.out.println("比较(b.bookNumber==Book.bookNumber)" + "的结果是："
                + (b.bookNumber == JBook.bookNumber));
    }
}