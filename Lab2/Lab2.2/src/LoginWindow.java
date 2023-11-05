import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame{
    private JPanel JPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginBtn;
    private JButton exitBtn;
    private JLabel errorLabel;

    String admin = "admin";
    String password = "admin";

    public static void main(String[] args) {
        LoginWindow LoginWindow = new LoginWindow();
        LoginWindow.setVisible(true);
    }
    public LoginWindow() {
        super("Login Panel");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userPassword = new String(textField1.getText());
                String userConfirm = new String(passwordField1.getPassword());

                if(userPassword.equals(admin) && userConfirm.equals(password)) {
                    errorLabel.setText("");
                    SportSelect obj = new SportSelect();
                    obj.setVisible(true);
                    dispose();
                } else {
                    errorLabel.setText("Niepoprawne dane, spróbuj ponownie");
                }
            }
        });
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
