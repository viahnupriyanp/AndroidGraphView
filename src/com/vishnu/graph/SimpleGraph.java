package com.vishnu.graph;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.vishnu.graphview.BarGraphView;
import com.vishnu.graphview.GraphView;
import com.vishnu.graphview.GraphView.GraphViewData;
import com.vishnu.graphview.GraphViewSeries.GraphViewSeriesStyle;
import com.vishnu.graphview.GraphViewSeries;
import com.vishnu.graphview.LineGraphView;
import com.vishnu.graph.R;

public class SimpleGraph extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.graphs);

		// init example series data
		GraphViewSeries exampleSeries = new GraphViewSeries("Good", new GraphViewSeriesStyle(Color.rgb(8, 83, 169), 3), new GraphViewData[] {
				new GraphViewData(1, 2.0d)
				, new GraphViewData(2, 1.5d)
				, new GraphViewData(2.5, 2.8d) // another frequency
				, new GraphViewData(3, 2.5d)
				, new GraphViewData(4, 1.0d)
				, new GraphViewData(5, 2.0d)
		});
		
		GraphViewSeries exampleSeries1 = new GraphViewSeries("Ave", new GraphViewSeriesStyle(Color.rgb(169, 8, 40), 3), new GraphViewData[] {
			new GraphViewData(1, 1.0d)
			, new GraphViewData(2, 2.5d)
			, new GraphViewData(2.5, 1.5d) // another frequency
			, new GraphViewData(3, 2.0d)
			, new GraphViewData(4, 1.3d)
			, new GraphViewData(5, 3.0d)
	});
		
		GraphViewSeries exampleSeries2 = new GraphViewSeries("Not Good", new GraphViewSeriesStyle(Color.rgb(71, 159, 8), 3), new GraphViewData[] {
			new GraphViewData(1, 1.5d)
			, new GraphViewData(2, 0.5d)
			, new GraphViewData(2.5, 1.5d) // another frequency
			, new GraphViewData(3, 2.7d)
			, new GraphViewData(4, 1.0d)
			, new GraphViewData(5, 2.4d)
	});
		
		
		
		
		LinearLayout layout1 = (LinearLayout) findViewById(R.id.graph1);
		GraphView graphView1 = null;		
		graphView1 = new LineGraphView(
				this
				, "Line Graph"
		);
		graphView1.setBackgroundColor(new Color().rgb(79, 82, 82));
		//((LineGraphView) graphView1).setDrawBackground(true);
		graphView1.setHorizontalLabels(new String[] {"2 days ago", "yesterday", "today", "tomorrow"});
		graphView1.setVerticalLabels(new String[] {"high", "middle", "low","better"});
		graphView1.addSeries(exampleSeries); // data
		graphView1.addSeries(exampleSeries1); // data
		graphView1.addSeries(exampleSeries2); // data
		graphView1.setShowLegend(true);
		layout1.addView(graphView1);
		
		
		LinearLayout layout2 = (LinearLayout) findViewById(R.id.graph2);
		GraphView graphView2 = null;		
		graphView2 = new BarGraphView(
				this
				, "Bar Graph"
		);
		graphView2.setBackgroundColor(new Color().rgb(50, 75, 61));
		graphView2.setHorizontalLabels(new String[] {"2 days ago", "yesterday", "today", "tomorrow"});
		graphView2.setVerticalLabels(new String[] {"high", "middle", "low", "better"});
		graphView2.addSeries(exampleSeries); // data
		graphView2.setShowLegend(true);
		layout2.addView(graphView2);
	}
}