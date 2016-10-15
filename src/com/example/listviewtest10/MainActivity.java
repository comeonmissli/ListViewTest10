package com.example.listviewtest10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {
	private String[] books=new String[]{"Androidƽ̨����֮��","Android�������������̳�",
			  "Android����","���Android����","Android���㿪ʼ"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter=new ArrayAdapter<String> (this,
				  android.R.layout.simple_list_item_1,books);
		setListAdapter(adapter);
	}

	private void setListAdapter(ArrayAdapter<String> adapter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
