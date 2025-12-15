package studio.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class TablePanel extends JPanel {
    JTable table;
    DefaultTableModel model;

    public TablePanel() {
        String[] column = {"ID", "Nama", "Kategori", "Jumlah", "Kondisi"};
        model = new DefaultTableModel(column, 0);
        table = new JTable(model);
    }
}