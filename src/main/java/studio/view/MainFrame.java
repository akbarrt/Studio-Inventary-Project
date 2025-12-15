package studio.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
    JFrame frame = new JFrame("Manajemen Studio Musik");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 700);
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

        add(new FormPanel());
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.setBorder(new EmptyBorder(10, 10, 10 ,10));

    }
    JTextField NamaAlat = new JTextField(20);
    JTextField Kategori = new JTextField(20);
    JTextField Jumlah = new JTextField(20);
    JTextField Kondisi = new JTextField(20);
    
}




