package observer.swingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: Java
 * @description:
 * @author: July
 * @create: 2018-10-04 09:43
 **/
public class SwingObserverExamople {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExamople examople = new SwingObserverExamople();
        examople.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("Should I do it？");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);

        // Set frame properties
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it,you might regret it!");
        }
    }

    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on,do it!");
        }
    }
}
