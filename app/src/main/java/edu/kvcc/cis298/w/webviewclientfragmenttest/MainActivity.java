package edu.kvcc.cis298.w.webviewclientfragmenttest;

import android.support.v4.app.Fragment;

/**
 * Created by Josh on 10/14/2016.
 */

public
class MainActivity
	extends SingleFragmentActivity
{
	@Override
	protected
	Fragment createFragment()
	{
		return WebViewSupportFragment.newInstance();
	}
}
