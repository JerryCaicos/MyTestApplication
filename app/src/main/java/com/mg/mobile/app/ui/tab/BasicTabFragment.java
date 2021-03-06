package com.mg.mobile.app.ui.tab;

import android.app.Fragment;

import com.mg.mobile.app.utils.LogUtils;


/**
 * Created by JerryCaicos on 16/1/16.
 */
public class BasicTabFragment extends Fragment
{
	public static final String TAG = "BasicTabFragment";
	@Override
	public void onResume()
	{
		super.onResume();
		onShow();
	}

	/**
	 * 显示的时候,onResume或者show的时候调用
	 *
	 * @Description:
	 */
	public void onShow()
	{
		LogUtils.i(TAG,"onShow");
	}

	@Override
	public void onPause()
	{
		super.onPause();
		onHide();
	}

	/**
	 * 隐藏的时候,onPause或者hide的时候调用
	 *
	 * @Description:
	 */
	public void onHide()
	{
		LogUtils.d(TAG,"onHide");
	}
}
