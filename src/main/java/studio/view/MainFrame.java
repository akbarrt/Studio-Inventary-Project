package studio.view;

import studio.controller.EquipmentController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Manajemen Studio Musik");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new BorderLayout());

        TablePanel tablePanel = new TablePanel();
        EquipmentController controller = new EquipmentController(tablePanel.getModel(), tablePanel.getTable());
        FormPanel formPanel = new FormPanel(controller);

        add(formPanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}




