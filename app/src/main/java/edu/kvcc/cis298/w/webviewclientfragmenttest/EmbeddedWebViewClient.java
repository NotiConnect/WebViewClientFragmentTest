package edu.kvcc.cis298.w.webviewclientfragmenttest;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * has methods that can be overridden
 * to allow host app to handle requests
 */
public
class EmbeddedWebViewClient
	extends WebViewClient
{
	@Override
	public
	boolean shouldOverrideUrlLoading(
		WebView view,
		WebResourceRequest request
											  )
	{
		return super.shouldOverrideUrlLoading( view,
															request );
	}
}
