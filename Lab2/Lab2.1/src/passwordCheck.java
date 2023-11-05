import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passwordCheck extends JFrame {
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton okButton;

    String password = "codejava";

    public static void main(String[] args) {
        passwordCheck passwordCheck = new passwordCheck();
        passwordCheck.setVisible(true);
    }

    public passwordCheck() {
        super("Login Panel");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userPassword = new String(passwordField1.getPassword());
                String userConfirm = new String(passwordField2.getPassword());

                if(userPassword.equals(password) && userConfirm.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password.");
                } else if(userPassword.equalsIgnoreCase(userConfirm)) {
                    JOptionPane.showMessageDialog(null, "Wrong password!");
                } else if (!userPassword.equals(userConfirm)) {
                    JOptionPane.showMessageDialog(null, "Paasswords are not match!");
                }
            }
        });
    }
}
