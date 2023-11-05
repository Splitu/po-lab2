import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramChoose extends JFrame{
    private JPanel JPanel;
    private JButton submitBtn;
    private JButton backBtn;
    private JRadioButton strengthTrainingBtn;
    private JRadioButton enduranceTrainingBtn;
    private JRadioButton mobilityTrainingBtn;
    private JRadioButton plyometricsTrainingBtn;

    public static void main(String[] args) {
        ProgramChoose ProgramChoose = new ProgramChoose();
        ProgramChoose.setVisible(true);
    }

    ProgramChoose() {
        super("Wybór treningu");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SportSelect obj = new SportSelect();
                obj.setVisible(true);
                dispose();
            }
        });
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cena = 0;
                String msg = "";
                if (strengthTrainingBtn.isSelected()) {
                    cena += 120;
                    msg += "Trening siłowy - 120 PLN\n";
                }
                if (enduranceTrainingBtn.isSelected()) {
                    cena += 200;
                    msg += "Trening wydolnościowy - 200 PLN\n";
                }
                if (mobilityTrainingBtn.isSelected()) {
                    cena += 250;
                    msg += "Trening mobility - 250 PLN\n";
                }
                if (plyometricsTrainingBtn.isSelected()) {
                    cena += 150;
                    msg += "Trening plyometryczny - 150 PLN\n";
                }

                msg += "=====================================\n";

                JOptionPane.showMessageDialog(null, msg + "Razem " + cena);
            }
        });
    }
}
