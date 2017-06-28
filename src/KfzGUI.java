import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bweic on 23.06.2017.
 */
public class KfzGUI {
    private JButton btnKnd;
    private JPanel jpanel;
    private JTextField txtVn;
    private JTextField txtKn;
    private JTextField txtGb;
    private JTextField txtNn;
    private JComboBox cbVip;
    private JTextArea lbl;
    private JButton btnRand;
    LISTE lst = new LISTE();


        public static void main(){
            JFrame frame = new JFrame("KfzGUI");
            frame.setContentPane(new KfzGUI().jpanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        }


    public KfzGUI(){
        btnKnd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                lst.hintenEinfuegen(new Kunde(txtVn.getText(), txtNn.getText(),
                        txtGb.getText(), Integer.parseInt(txtKn.getText()), (String)cbVip.getSelectedItem()));
                lbl.append(lst.informationAusgeben());
                txtVn.setText("");
                txtNn.setText("");
                txtGb.setText("");
                txtKn.setText("");

            }
        });
        btnRand.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int zahl = (int)((Math.random())*9999);
                String z = "" + zahl;
                txtKn.setText(z);
                StartGUI start = new StartGUI();

            }
        });

    }
}
