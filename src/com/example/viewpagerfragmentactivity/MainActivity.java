package com.example.viewpagerfragmentactivity;

import java.util.List;
import java.util.Vector;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;

public class MainActivity extends FragmentActivity implements
		OnPageChangeListener {
	/** maintains the pager adapter */
	private PagerAdapter mPagerAdapter;
	private String tag = getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_main);
		// initialsie the pager

		this.initialisePaging();
	}

	private void initialisePaging() {

		List<Fragment> fragments = new Vector<Fragment>();
		String a = FragmentA.class.getName();
		Log.d(tag, a);
		for (int i = 0; i < 10; i++) {
			FragmentA aa = new FragmentA();
			aa.updateView(i);
			fragments.add(aa);

		}

		this.mPagerAdapter = new NewsDetailsPagerAdapter(
				super.getSupportFragmentManager(), fragments);
		
		ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
		pager.setAdapter(this.mPagerAdapter);
		pager.setOnPageChangeListener(this);
		pager.setCurrentItem(3,true);

	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		// Log.d(tag,"onPageScrollStateChanged: "+arg0);

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		// Log.d(tag,"onPageScrolled");

	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
		Log.d(tag, "onPageSelected: " + arg0);

	}

}