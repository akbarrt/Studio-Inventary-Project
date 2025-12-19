package studio.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TablePanel extends JPanel {

    private JTable table;
    private DefaultTableModel model;

    public TablePanel() {
        setLayout(new BorderLayout());

        String[] columns = {
                "ID", "Equipment Name", "Category", "Quantity", "Condition"
        };

        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        table.setRowHeight(28);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public JTable getTable() {
        return table;
    }
}
