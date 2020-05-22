package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:12
    Content:JPetTest//课本例4.21//实验第二题
*/

public class JPetTest {
    static void showPetSkill(JPet5 p) {
        p.petSkill();
    }

    static void showName(SmallAnimal s) {
        s.name();
    }

    static void A(JPet5 p) {
        p.petSkill();
        p.name();
    }

    static void B(JRatHunter r) {
        r.ratHunt();
    }

    static void C(JFishHunter f) {
        f.fishHunt();
    }

    static void D(SmallAnimal s) {
        s.name();
    }

    public static void main(String args[]) {
        System.out.println("现在开始以JPet5接口作为参数传值--------");
        JPet5 a1 = new JDog5();
        JPet5 b1 = new JCat5();
        showPetSkill(a1);
        showPetSkill(b1);
        System.out.println("现在开始以SmallAnimal类作为参数传值--------");
        SmallAnimal a2 = new JDog5();
        SmallAnimal b2 = new JCat5();
        showName(a2);
        showName(b2);
        System.out.println("现在开始对JCat5类产生的对象测试--------");
        JCat5 c = new JCat5();
        A(c);
        B(c);
        C(c);
        D(c);
    }
}

interface JPet5 {
    void petSkill();

    void name();
}

interface JRatHunter {
    void ratHunt();
}

interface JFishHunter {
    void fishHunt();
}

class SmallAnimal {
    public void name() {
        System.out.println("class: SmallAnimal---method: name");
    }
}

class JDog5 extends SmallAnimal implements JPet5 {
    public void petSkill() {
        System.out.println("class: JDog5---method: petSkill");
    }

    public void name() {
        System.out.println("class: JDog5---method: name");
    }
}

class JCat5 extends SmallAnimal implements JPet5, JRatHunter, JFishHunter {
    public void petSkill() {
        System.out.println("class: JCat5---method: petSkill");
    }

    public void ratHunt() {
        System.out.println("class: JCat5---method: ratHunt");
    }

    public void fishHunt() {
        System.out.println("class: JCat5---method: fishHunt");
    }

}