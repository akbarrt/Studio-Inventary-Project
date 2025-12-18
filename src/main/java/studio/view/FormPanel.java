package studio.view;

import studio.controller.EquipmentController;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {

    JTextField idField, nameField, qtyField;
    JComboBox<String> categoryBox, conditionBox;
    JButton addButton, updateButton, deleteButton;

    public FormPanel(EquipmentController controller) {
        setLayout(new GridLayout(0, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        idField = new JTextField();
        nameField = new JTextField();
        qtyField = new JTextField();

        categoryBox = new JComboBox<>(new String[]{
                "Guitar", "Drum", "Audio", "Keyboard", "Other"
        });

        conditionBox = new JComboBox<>(new String[]{
                "Good", "Needs Service", "Broken"
        });

        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        add(new JLabel("ID"));
        add(idField);
        add(new JLabel("Equipment Name"));
        add(nameField);
        add(new JLabel("Category"));
        add(categoryBox);
        add(new JLabel("Quantity"));
        add(qtyField);
        add(new JLabel("Condition"));
        add(conditionBox);

        add(addButton);
        add(updateButton);
        add(new JLabel());
        add(deleteButton);

        addButton.addActionListener(e -> controller.add(
            idField.getText(),
            nameField.getText(),
            (String) categoryBox.getSelectedItem(),
            Integer.parseInt(qtyField.getText()),
            (String) conditionBox.getSelectedItem()
        ));

        updateButton.addActionListener(e -> controller.update(
            idField.getText(),
            nameField.getText(),
            (String) categoryBox.getSelectedItem(),
            Integer.parseInt(qtyField.getText()),
            (String) conditionBox.getSelectedItem()
        ));

        deleteButton.addActionListener(e -> controller.delete());
    }
}
