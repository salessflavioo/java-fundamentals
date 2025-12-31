import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo {
    private JTextField txtName;
    private JButton btnOk;
    private JPanel panel;

    public HelloDemo() {

        txtName = new JTextField(20);

        btnOk = new JButton("OK");

        panel = new JPanel();

        panel.add(new JLabel("Nome: "));
        panel.add(txtName);
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnOk, txtName.getText() + " Hello!");
            }
        });
    }

    public static void main(String[] args) {
        HelloDemo h=new HelloDemo();

        JFrame frame = new JFrame("Hello Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(h.panel);
        frame.pack();
        frame.setVisible(true);
    }
}
