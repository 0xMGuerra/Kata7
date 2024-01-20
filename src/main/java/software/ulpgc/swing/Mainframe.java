package software.ulpgc.swing;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {
    private JPanelDisplay histogramDisplay;

    public Mainframe() throws HeadlessException {
        setTitle("Histogram");
        setSize(1280, 760);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JPanelDisplay jPanelDisplay = new JPanelDisplay();
        this.histogramDisplay = jPanelDisplay;
        return jPanelDisplay;
    }

    public JPanelDisplay getHistogramDisplay() {
        return histogramDisplay;
    }
}
