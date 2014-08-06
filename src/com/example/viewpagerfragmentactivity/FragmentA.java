package com.example.viewpagerfragmentactivity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
		// add by young 2014-08-05
		ImageView IV = (ImageView) v.findViewById(R.id.imageView1);
		
		// (pageId+1) cause my res is begin with loading_01 but pageId is begin
		// with 0
		// @author: Marnon 2014-08-06
		Resources res = getResources();
		IV.setImageBitmap(BitmapFactory.decodeResource(
				getResources(),
				res.getIdentifier("loading_0" + (pageId + 1), "drawable",
						"com.example.viewpagerfragmentactivity")).copy(
				Bitmap.Config.ARGB_8888, true));
		
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