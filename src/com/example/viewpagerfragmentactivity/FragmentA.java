package com.example.viewpagerfragmentactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentA extends Fragment {
	private String tag = getClass().getSimpleName();
	View v;
	int pageId;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(tag, "onCreateView");
		View v = inflater.inflate(R.layout.tab1_fragment, container, false);
		TextView tv = (TextView) v.findViewById(R.id.textView1);
		tv.setText("pageId: " + pageId);

		return v;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);

	}

	public void updateView(int pageId) {
		this.pageId = pageId;
		Log.d(tag, "update view ja");

	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(tag, "onStart");
	}
}