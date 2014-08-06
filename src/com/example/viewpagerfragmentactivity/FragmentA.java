package com.example.viewpagerfragmentactivity;

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
		//add by young 2014-08-05
		ImageView IV = (ImageView) v.findViewById(R.id.imageView1);
		// this switch is just for test. I don't support to do such stupid thing. 
		//		@author: Marnon 2014-08-05
		switch(pageId)
		{
		case 0:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_01).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 1:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_01).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 2:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_02).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 3:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_03).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 4:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_04).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 5:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_05).copy(Bitmap.Config.ARGB_8888, true));
			break;
		case 6:
			IV.setImageBitmap(BitmapFactory.decodeResource(getResources(),
					R.drawable.loading_06).copy(Bitmap.Config.ARGB_8888, true));
			break;
		}

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