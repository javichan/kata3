package kata3;

import javax.swing.JPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
            "Histograma JFreeChart",
            "Dominios email",
            "NÂº de emails",
            dataSet,
            PlotOrientation.VERTICAL,
            false,
            false,
            rootPaneCheckingEnabled
            );
        return chart;
    
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(4,"","ulpgc.es");
        dataSet.addValue(7,"","ull.es");
        dataSet.addValue(2,"","gmail.com");
        return dataSet;
        
    }
    
    
    
    
}