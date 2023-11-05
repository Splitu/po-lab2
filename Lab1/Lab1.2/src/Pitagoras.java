import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pitagoras extends JFrame{
    private JPanel JPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton checkBtn;
    private JButton exitBtn;
    private JLabel checkLabel;

    double A, B, C;

    public static void main(String[] args) {
        Pitagoras pitagoras = new Pitagoras();
        pitagoras.setVisible(true);
    }

    public Pitagoras() {
        super("Czy trójkąt jest prostokątny?");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width,height);
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        checkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A = Double.parseDouble(textField1.getText());
                B = Double.parseDouble(textField2.getText());
                C = Double.parseDouble(textField3.getText());
                if((A * A + B * B == C * C) || (A * A + C* C == B * B) || (B * B + C * C == A * A)) {
                    checkLabel.setText("Podany trójkąt jest trójkątem prostokątnym");
                } else {
                    checkLabel.setText("Podany trójkąt nie jest trójkątem prostokątnym");
                }
            }
        });
    }
}
