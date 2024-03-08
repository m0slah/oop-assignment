import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheButtons extends JPanel {

    private JButton button1, button2, button3;

    public TheButtons() {
        setLayout(new FlowLayout());

        button1 = new JButton("Black");
        button2 = new JButton("White");
        button3 = new JButton("Blue");

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());

        add(button1);
        add(button2);
        add(button3);
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            Color bgColor = null;
            // Check which button was clicked and set the background color accordingly
            if (clickedButton == button1) {
                bgColor = Color.BLACK;
            } else if (clickedButton == button2) {
                bgColor = Color.WHITE;
            } else if (clickedButton == button3) {
                bgColor = Color.BLUE;
            }
            setBackground(bgColor);
            repaint();
        }
    }
}