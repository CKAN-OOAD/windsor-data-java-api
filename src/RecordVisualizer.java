/**
 * Creates a Simple Data Visualization based off the record given and its fields.
 *
 * @author Jose Guillen Santos
 * @version 0.0.1
 */


import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.QuickChart;
import java.util.ArrayList;


public class RecordVisualizer{
    public RecordList records;
    public RecordVisualizer(RecordList records){
        this.records = records;
    }

    public void displayVisualization() {

        ArrayList xData = new ArrayList<Double>();
        ArrayList yData = new ArrayList<Double>();

        for (int i = 0; i < records.size(); i++) {
            xData.add(Double.parseDouble(records.get(i).getValue(3)));
            yData.add(Double.parseDouble(records.get(i).getValue(4)));
        }
        // Create Chart
        XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

        // Show it
        new SwingWrapper(chart).displayChart();
    }



}



