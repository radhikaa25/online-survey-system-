import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RATING extends JFrame {
    private JPanel main;
    private JTextField txtName;
    private JTextField txtPhone;
    private JTextField txtEmail;
    private JTextArea txtFeedback;
    private JButton SUBMITButton;
    private JSpinner spinner1;

    public RATING() {


    SUBMITButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = txtName.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();
            String feedback = txtFeedback.getText();


            JOptionPane.showMessageDialog(null, name);
            JOptionPane.showMessageDialog(null, phone);
            JOptionPane.showMessageDialog(null, email);
            JOptionPane.showMessageDialog(null,feedback);
        }
    });
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String args[]) {
        RATING j = new RATING();
        j.setContentPane(new RATING().main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();

    }

}







