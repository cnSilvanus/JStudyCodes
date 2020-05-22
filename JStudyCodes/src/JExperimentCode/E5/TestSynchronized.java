package JExperimentCode.E5;

//package lesson.thread;

public class TestSynchronized implements Runnable {

    //一共有10张票
    private int ticket=10;

    public void run(){
        //持续卖票，一直到剩余票数为0；
        while(ticket>0) {
            sell();
        }
    }

    public synchronized void sell() {
        if (ticket > 0) {
            try {
                //为了演示产生的问题，线程在这里睡眠一次
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //睡眠结束后，继续当前的票进行销售
            System.out.println(Thread.currentThread().getName()+"卖票-->"+(this.ticket--));
        }
    }

    static public void main(String args[]) {//建立三个售票窗口的线程类来模拟窗口售票

        TestSynchronized ru = new TestSynchronized();
        Thread t = new Thread(ru);
        t.setName("窗口1");
        Thread t1 = new Thread(ru);
        t1.setName("窗口2");
        Thread t2 = new Thread(ru);
        t2.setName("窗口3");
        t.start();
        t1.start();
        t2.start();
    }
}

