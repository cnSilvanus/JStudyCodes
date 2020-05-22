package JHomeworkCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;

public class CopyUtil extends JFrame implements ActionListener {
    private Button copy = new Button("Copy");
    private TextField text = new TextField(20);
    private TextField show = new TextField(20);

    public CopyUtil() {
        super("Example");
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3, 0));
        jp.add(text);
        jp.add(show);
        jp.add(copy);
        copy.addActionListener(this);
        text.addActionListener(this);
        this.add(jp);
        this.setTitle("JCopyUtil");
        this.setBounds(100, 100, 300, 280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setVisible(true);
        this.setResizable(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == text) {
            text.getText().trim();
        } else if (e.getSource() == copy) {
            show.setText(text.getText());
        }
    }

    public static void main(String[] args) {
        CopyUtil click = new CopyUtil();
    }
}