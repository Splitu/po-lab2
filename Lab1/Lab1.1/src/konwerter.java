import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class konwerter extends JFrame {
    private JPanel JPanel;
    private JPanel BtnLabel;
    private JPanel ConvertLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton convertBtn;
    private JButton exitBtn;

    double value, score;

    public static void main(String[] args) {
        konwerter konwerter = new konwerter();
        konwerter.setVisible(true);
    }

    public konwerter() {
        super("Kalkulator dwóch liczb");
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
        convertBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Double.parseDouble(textField1.getText());
                score = value * 9 / 5 + 32;
                textField2.setText(String.valueOf(score));
            }
        });
    }
}
