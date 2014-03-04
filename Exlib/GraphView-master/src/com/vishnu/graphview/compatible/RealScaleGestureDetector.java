package com.vishnu.graphview.compatible;

import android.content.Context;
import android.view.ScaleGestureDetector;


public class RealScaleGestureDetector extends ScaleGestureDetector {
	public RealScaleGestureDetector(Context context, final com.vishnu.graphview.compatible.ScaleGestureDetector fakeScaleGestureDetector, final com.vishnu.graphview.compatible.ScaleGestureDetector.SimpleOnScaleGestureListener fakeListener) {
		super(context, new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener() {
			@Override
			public boolean onScale(ScaleGestureDetector detector) {
				return fakeListener.onScale(fakeScaleGestureDetector);
			}
		});
	}
}
