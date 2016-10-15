package edu.kvcc.cis298.w.webviewclientfragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public
class WebViewSupportFragment
	extends Fragment
{
	// private variables
	// constants
	private static final String KEY_URL = "url";
	private final String TAG = this.getClass().getSimpleName();
	// model variables
	private String mURL;
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

	@Override
	public
	void onActivityCreated(
		@Nullable
			Bundle savedInstanceState
								 )
	{
		super.onActivityCreated( savedInstanceState );
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
		if( mURL != null)
		{
			WebView
				webview = (WebView)
				view.findViewById( R.id.fragment_web_wv_embedded );
			// configure settings
			webview.setWebViewClient(
				new EmbeddedWebViewClient()
											);
			webview.loadUrl( mURL );
		}
		// attach listeners and initialize ui

		return view;
	}

	@Override
	public
	void onSaveInstanceState( Bundle outState )
	{
		super.onSaveInstanceState( outState );
		outState.putString( KEY_URL, mURL );
	}

	public void setURLContent(String URL)
	{
		// should add check for null and empty string
		mURL = URL;
	}
}
