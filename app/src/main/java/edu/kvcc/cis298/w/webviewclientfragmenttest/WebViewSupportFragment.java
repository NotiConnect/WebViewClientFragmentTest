package edu.kvcc.cis298.w.webviewclientfragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public
class WebViewSupportFragment
	extends Fragment
{
	// private variables
	// constants
	private final String TAG = this.getClass().getSimpleName();
	// model variables
	private String currentURL;
	// view variables

	// public methods
	public static
	WebViewSupportFragment newInstance()
	{
		Bundle
			args = new Bundle();
		// put stuff here

		WebViewSupportFragment fragment
			= new WebViewSupportFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public
	void onCreate(
		@Nullable
			Bundle savedInstanceState
					 )
	{
		super.onCreate( savedInstanceState );
	}

	@Nullable
	@Override
	public
	View onCreateView(
		LayoutInflater inflater,
		@Nullable
			ViewGroup container,
		@Nullable
			Bundle savedInstanceState
						  )
	{
		View view =
			inflater.inflate(
				R.layout.fragment_web,
				container,
				false
								 );
		// attach listeners and initialize ui

		return view;
	}

	public void init()
	{

	}
}
