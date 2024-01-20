package software.ulpgc.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import software.ulpgc.Histogram;
import software.ulpgc.HistogramDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class JPanelDisplay extends JPanel implements HistogramDisplay {

    @Override
    public void show(Histogram histogram) {
        ChartPanel chartPanel = new ChartPanel(chartOf(histogram));
        chartPanel.setPreferredSize(new Dimension(1280, 760));
        add(chartPanel);
    }

    private JFreeChart chartOf(Histogram histogram) {
        return ChartFactory.createBarChart(
                histogram.name(),
                histogram.xAxis(),
                histogram.yAxis(),
                toDataSet(histogram.data())
        );

    }

    private DefaultCategoryDataset toDataSet(Map<String, Integer> data) {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        for(String key : data.keySet()) {
            defaultCategoryDataset.addValue(data.get(key), "Country", key);
        }
        return defaultCategoryDataset;
    }
}
