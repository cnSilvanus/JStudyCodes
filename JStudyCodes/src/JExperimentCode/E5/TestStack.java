package JExperimentCode.E5;

//TestStack.java
//本实例主要是利用LinkeList来实现堆栈数据结构。
//栈的定义：栈（Stack）是限制仅在表的一端进行插入和删除运算的线性表。
//	 (1)通常称插入、删除的这一端为栈顶（Top），另一端称为栈底（Bottom）。
// (2)当表中没有元素时称为空栈。
// (3)栈为后进先出（Last In First Out）的线性表，简称为LIFO表。
//栈的修改是按后进先出的原则进行。每次删除（退栈）的总是当前栈中"最新"的元素，即//最后插入（进栈）的元素，而最先插入的是被放在栈的底部，要到最后才能删除。
//实现代码：
import java.util.LinkedList;
public class TestStack {
    LinkedList linkList = new LinkedList<Object>();
    public void push(Object obj) {
        linkList.addFirst(obj);
    }
    public boolean isEmpty() {
        return linkList.isEmpty();
    }
    public void clear() {
        linkList.clear();
    }
    //移除并返回此列表的第一个元素
    public Object pop() {
        if (!linkList.isEmpty())
            return linkList.removeFirst();
        return "栈内无元素";
    }
    public int getSize() {
        return linkList.size();
    }
    public static void main(String[] args) {
        TestStack myStack = new TestStack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
