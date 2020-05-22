package JExperimentCode.E4;
/*
    Author:YuShiHui@2019/11/17-8:22
    Content:JCalculationSeries//实验第五题
*/

public class JCalculationSeries {
    public static void main(String[] args) {
        final double x = 1.0;
        double sum = 1.0;
        int i = 1;
        int q = 1;
        double posI = x;
        while (posI > 0.00001) {
            sum += posI;
            i++;
            q = q * i;
            posI = Math.pow(x, i) / (double) (q);
        }
        System.out.println("sum=" + sum + "\nn=" + i);
    }
}