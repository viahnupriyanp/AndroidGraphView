package com.vishnu.graphview.compatible;

import android.content.Context;
import android.view.ScaleGestureDetector;

/**
 * Copyright (C) 2011 Jonas Gehring
 * Licensed under the GNU Lesser General Public License (LGPL)
 * http://www.gnu.org/licenses/lgpl.html
 */
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
