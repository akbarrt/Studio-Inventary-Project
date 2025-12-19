package studio.view;

import studio.controller.EquipmentController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Music Studio Inventory");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new BorderLayout());

        // Dark background for the main window content
        getContentPane().setBackground(new Color(32, 32, 40));

        TablePanel tablePanel = new TablePanel();
        EquipmentController controller = new EquipmentController(tablePanel.getModel(), tablePanel.getTable());
        FormPanel formPanel = new FormPanel(controller);

        add(formPanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}




