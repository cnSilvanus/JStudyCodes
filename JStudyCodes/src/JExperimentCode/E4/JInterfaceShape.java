package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:14
    Content:JInterfaceShape//实验第三题
*/

public class JInterfaceShape {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();
        System.out.println("长为2的正方形面积" + square.area(2));
        System.out.println("半径为3的圆形面积" + circle.area(3));

    }
}

interface Shape {
    double area(double d);
}

class Square implements Shape {
    public double area(double d) {
        return d * d;
    }

}

class Circle implements Shape {
    public double area(double d) {
        return 3.1415 * d * d;
    }

}