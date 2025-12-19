package studio;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
// import com.formdev.flatlaf.FlatDarkLaf;
// import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.*;

import studio.view.MainFrame;

public class App {
    public static void main(String[] args) {
                FlatDarkLaf.setup();
                // FlatLightLaf.setup();

        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 20);
        UIManager.put("TextComponent.arc", 20);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("defaultFont", new Font("Jetbrains Mono", Font.PLAIN, 13));
        UIManager.put("Button.background", new Color(35,108,174));
        UIManager.put("Button.foreground", Color.WHITE);


        new MainFrame();
    }


}
