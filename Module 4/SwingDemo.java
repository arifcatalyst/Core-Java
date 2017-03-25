import javax.swing.*;

/**
 * Created by Arif Zeeshan on 3/20/2017 at 8:34 PM
 */
public class SwingDemo {
    SwingDemo()
    {
        JFrame jfrm=new JFrame("First GUI");
        jfrm.setSize(400,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jlab=new JLabel("Hello Arif");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
