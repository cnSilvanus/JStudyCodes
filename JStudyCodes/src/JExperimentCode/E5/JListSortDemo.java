package JExperimentCode.E5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JListSortDemo extends JFrame implements ActionListener {
    JList jl_in = new JList();
    JList jl_out = new JList();
    JButton jb_sort = new JButton("排序");
    JButton jb_clear = new JButton("退出");
    String[] nums = {"20.6", "59.5", "4", "56.1", "102.5", "99.9"};

    JListSortDemo(String title) {
        super(java.lang.String.valueOf(title));
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 1, 2, 2));

        initContent();
        JScrollPane scrollPane11 = new JScrollPane(jl_in);
        c.add(scrollPane11);

        JScrollPane scrollPane12 = new JScrollPane(jl_out);
        c.add(scrollPane12);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel3.add(jb_sort);
        panel3.add(jb_clear);
        c.add(panel3);

        jb_sort.addActionListener(this);
        jb_clear.addActionListener(this);
    }

    private void initContent() {
        jl_in.setListData(nums);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb_sort) {
            double[] arr = new double[nums.length];
            String[] sarr = new String[nums.length];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = Double.valueOf(nums[i]);
            }
            Sort s = new Sort(arr);
            for (int i = 0; i < nums.length; i++) {
                sarr[i] = Double.toString(arr[i]);
            }
            jl_out.setListData(sarr);
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JListSortDemo ast = new JListSortDemo("AnySort");
        ast.setSize(300, 300);
        ast.setVisible(true);
    }
}

class Sort {
    Sort(double[] arr) {
        double swap;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
    }
}