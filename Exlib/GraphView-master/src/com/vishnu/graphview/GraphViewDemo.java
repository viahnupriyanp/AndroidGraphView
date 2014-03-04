package com.vishnu.graphview;

import android.app.Activity;
import android.os.Bundle;

import com.vishnu.graphview.GraphView.GraphViewData;


public class GraphViewDemo extends Activity {
	/**
	 * @param savedInstanceState
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LineGraphView graphView = new LineGraphView(
				this
				, "GraphViewDemo"
		);
		graphView.addSeries(new GraphViewSeries(new GraphViewData[] {
				new GraphViewData(1, 2.0d)
				, new GraphViewData(2, 1.5d)
				, new GraphViewData(2.5, 3.0d)
				, new GraphViewData(3, 2.5d)
				, new GraphViewData(4, 1.0d)
				, new GraphViewData(5, 3.0d)
		}));
		setContentView(graphView);
	}
}
