package studio.controller;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EquipmentController {

    private final DefaultTableModel model;
    private final JTable table;

    public EquipmentController(DefaultTableModel model, JTable table) {
        this.model = model;
        this.table = table;
    }

    public void add(String id, String name, String category, int quantity, String condition) {
        model.addRow(new Object[]{id, name, category, quantity, condition});
    }

    public void update(String id, String name, String category, int quantity, String condition) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            model.setValueAt(id, selectedRow, 0);
            model.setValueAt(name, selectedRow, 1);
            model.setValueAt(category, selectedRow, 2);
            model.setValueAt(quantity, selectedRow, 3);
            model.setValueAt(condition, selectedRow, 4);
        }
    }

    public void delete() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            model.removeRow(selectedRow);
        }
    }
}
