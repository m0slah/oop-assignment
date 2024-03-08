import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Kurdish Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        KurdistanFlag KurdistanFlag = new KurdistanFlag();
        frame.add(KurdistanFlag); //comment this line if you want to show the Buttons to chnage background

        TheButtons theButtons = new TheButtons();
//        frame.add(theButtons); // comment this line if you want to Kurdistan Flag

        frame.setVisible(true);
    }
}
