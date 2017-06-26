import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bweic on 23.06.2017.
 */
public class KfzGUI {
    private JTextField txt;
    private JButton btnKnd;
    private JPanel jpanel;
    private JTextField txtVn;
    private JTextField txtVIP;
    private JTextField txtKn;
    private JTextField txtGb;
    private JTextField txtAlt;
    private JTextField txtNn;
    private JTextArea lbl;
    private JList listKunden;
    LISTE lst = new LISTE();


    public static void main(String[] args) {
        JFrame frame = new JFrame("KfzGUI");
        frame.setContentPane(new KfzGUI().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

    public KfzGUI() {
        btnKnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lst.hintenEinfuegen(new Kunde(txtVn.getText(), txtVn.getText(), Integer.parseInt(txtAlt.getText()), txtGb.getText(), Integer.parseInt(txtKn.getText()), txtVIP.getText()));

                lbl.insert(lst.informationAusgeben(), 1);
            }
        });


    }
}
