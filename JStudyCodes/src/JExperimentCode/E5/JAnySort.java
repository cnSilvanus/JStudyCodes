package JExperimentCode.E5;
//双文本框输入数值，点击按钮排序
import javax.swing.*;
import java.awt.event.*;
//import java.awt.*;

public class JAnySort extends JFrame implements ActionListener {
    private JButton jb_act = new JButton("排序");
    private JButton jb_cle = new JButton("清除");
    private JTextArea in = new JTextArea();
    private JTextArea out = new JTextArea();
    private JScrollPane jin = new JScrollPane(in);
    private JScrollPane jout = new JScrollPane(out);
    double[] s;

    public JAnySort() {
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jin.setBounds(2, 2, 300, 100);
        jp.add(jin);
        in.setLineWrap(true);
        jout.setBounds(2, 104, 300, 100);
        jp.add(jout);
        out.setLineWrap(true);

        jb_act.setBounds(90, 206, 69, 30);
        jp.add(jb_act);
        jb_cle.setBounds(159, 206, 69, 30);
        jp.add(jb_cle);

        jb_act.addActionListener(this);
        jb_cle.addActionListener(this);

        this.add(jp);
        this.setTitle("JAnySort");
        this.setBounds(100, 100, 318, 280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
    }

    private void getSort() {
        String arrayStr = in.getText().trim();
        String[] numStrs = arrayStr.split("\n");
        double[] numArray = new double[numStrs.length];
        for (int i = 0; i < numArray.length; i++) {
            String[] temp = numStrs[i].split("\n");
            char[] tempstrs = numStrs[i].toCharArray();
            if ((tempstrs[0] == '.') || (tempstrs[tempstrs.length - 1] == '.') || (temp.length >= 3)) {
                JOptionPane.showMessageDialog(null, "非法输入");
                in.setText("");
                return;
            }
            numArray[i] = Double.parseDouble(numStrs[i]);
        }
        s = numArray;
        Sort(s);
        for (double value : s) {
            out.append(value + "\n");
        }
    }

    private void Sort(double[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    double temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb_act) {
            getSort();
        }
        if (e.getSource() == jb_cle) {
            in.setText("");
            out.setText("");
        }
    }

    public static void main(String[] args) {
        JAnySort jas = new JAnySort();
    }
}