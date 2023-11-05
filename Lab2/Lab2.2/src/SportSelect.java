import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportSelect extends JFrame {
    private JPanel JPanel;
    private JRadioButton basketBtn;
    private JRadioButton footballBtn;
    private JRadioButton volleyballBtn;
    private JLabel JLabelImage;
    private JButton okButton;
    private JButton backButton;
    private ImageIcon basketIcon = new ImageIcon(getClass().getResource("koszykowka.png"));
    private ImageIcon footballIcon = new ImageIcon(getClass().getResource("nozna.png"));
    private ImageIcon volleyIcon = new ImageIcon(getClass().getResource("siatkowka.png"));
    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight) {
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }
    public static void main(String[] args) {
        SportSelect sportSelect = new SportSelect();
        sportSelect.setVisible(true);
    }

    SportSelect() {
        super("Wybór dyscypliny");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        basketBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(basketBtn.isSelected())
                    JLabelImage.setIcon(resize(basketIcon,180,180));
            }
        });
        footballBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(footballBtn.isSelected())
                    JLabelImage.setIcon(resize(footballIcon,200,180));
            }
        });
        volleyballBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(volleyballBtn.isSelected())
                    JLabelImage.setIcon(resize(volleyIcon,180,180));
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginWindow obj = new LoginWindow();
                obj.setVisible(true);
                dispose();
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            ProgramChoose obj = new ProgramChoose();
            obj.setVisible(true);
            dispose();
            }
        });
    }
}
