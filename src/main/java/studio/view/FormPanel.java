package studio.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;


public class FormPanel extends JPanel {
    JTextField nameField, qtyField;
    JButton addButton;

    public FormPanel() {
        setLayout(new GridLayout(0, 2));

        // Example fields; adjust labels and names as needed
        add(new JLabel("Nama Alat:"));
        nameField = new JTextField(20);
        add(nameField);

        add(new JLabel("Jumlah:"));
        qtyField = new JTextField(20);
        add(qtyField);

        addButton = new JButton("Tambah");
        add(addButton);

    //     JPanel panel = new JPanel();
    //     panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    //     panel.setBorder(new EmptyBorder(10, 10, 10 ,10));
    //     JTextField NamaAlat = new JTextField(20);
    //     JTextField Kategori = new JTextField(20);
    //     JTextField Jumlah = new JTextField(20);
    //     JTextField Kondisi = new JTextField(20);

    //     panel.add(new JLabel("Book ID:"));
    //     panel.add(NamaAlat);
    //     panel.add(new JLabel("Title:"));
    //     panel.add(Kategori);
    //     panel.add(new JLabel("Author:"));
    //     panel.add(Jumlah);
    //     panel.add(new JLabel("Year:"));
    //     panel.add(Kondisi);
    


}
}
