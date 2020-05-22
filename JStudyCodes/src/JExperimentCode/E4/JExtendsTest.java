package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:03
    Content:JExtendsTest//实验第一题
*/

public class JExtendsTest extends People {
    void drink() {
        System.out.println("Beer, Thanks!");
    }

    void dance() {
        System.out.println("Dance Queen!");
    }

    public static void main(String[] args) {
        People tom = new People();
        People lucy = new JExtendsTest();
        People mary = new OldPeople();
        tom.drink();
        lucy.drink();
        mary.drink();
        if (lucy instanceof JExtendsTest) {
            ((JExtendsTest) lucy).dance();
        } else {
            System.out.println("Enjoying Yourself");
        }
    }
}

class People {
    void drink() {
        System.out.println("Lelecha, Please!");
    }
}

class OldPeople extends People {
    void drink() {
        System.out.println("Wait a moment, Please!");
    }
}