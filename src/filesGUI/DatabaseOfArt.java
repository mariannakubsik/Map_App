package filesGUI;

import classesMap.TableDataArt;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DatabaseOfArt extends JFrame {
    private JTable table;
    private JPanel panel1;

    public DatabaseOfArt(JButton button) {
        button.setEnabled(false);
        TableDataArt model = new TableDataArt();
        table.setModel(model);
        setContentPane(panel1);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                button.setEnabled(true);
            }
        });
    }

}

