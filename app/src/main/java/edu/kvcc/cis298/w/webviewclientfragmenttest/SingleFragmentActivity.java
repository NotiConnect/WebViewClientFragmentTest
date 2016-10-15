package edu.kvcc.cis298.w.webviewclientfragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public abstract
class SingleFragmentActivity
	extends AppCompatActivity
{
	// public methods
	@Override
	public
	void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );

		FragmentManager
			fragmentManager
			= getSupportFragmentManager();

		Fragment
			fragment
			= fragmentManager.findFragmentById( R.id.activity_main_fragment_container );

		if ( fragment
			  == null )
		{
			fragment
				= createFragment();
			fragmentManager
				.beginTransaction()
				.add(
					R.id.activity_main_fragment_container,
					fragment
					 )
				.commit();
		}
	}

	// protected methods
	protected abstract
	Fragment createFragment();
}
