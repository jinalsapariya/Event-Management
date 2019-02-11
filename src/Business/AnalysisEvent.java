/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sapar
 */



import Business.DB4OUtil.DB4OUtil;
import Business.Event.Event;
import Business.Event.EventDirectory;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class AnalysisEvent extends JFrame {

  private static final long serialVersionUID = 1L;

  public AnalysisEvent(String appTitle) {
    super(appTitle);

    // Create Dataset
    CategoryDataset dataset = createDataset();
    
    //Create chart
    JFreeChart chart=ChartFactory.createBarChart(
        "Event wise Users", //Chart Title
        "Event", // Category axis
        "Number of Users", // Value axis
        dataset,
        PlotOrientation.VERTICAL,
        true,true,false
       );

    ChartPanel panel=new ChartPanel(chart);
    setContentPane(panel);
  }

  private CategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    DB4OUtil db = DB4OUtil.getInstance();
     
     EcoSystem sys = db.retrieveSystem();
     EventDirectory ev = sys.getEventDirectory();
     List<Event> li = ev.getEventList();
     for(Event e:li)
     {
                dataset.addValue(e.getAct_booking(), "Number of actual booking", e.getEventName());
                dataset.addValue(e.getCapacity(), "Remaining Capacity",e.getEventName());
     }
     
     
   
    return dataset;
  }

  public static void main(String[] args) throws Exception {
      
     
//     
     
     
     
    SwingUtilities.invokeAndWait(()->{
      AnalysisEvent example=new AnalysisEvent("Bar Chart Window");
      example.setSize(1000, 1000);
      example.setLocationRelativeTo(null);
      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      example.setVisible(true);
    });
  }
}