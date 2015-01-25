package com.codepath.example.drawablestylesdemo.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.drawablestylesdemo.R;

public class BasicDrawableActivity extends Activity {
	ListView lvItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_basic_drawable);
		setupListView();
	}
	
	public void onButtonClicked(View v) {
	   Toast.makeText(this, "Clicked!", Toast.LENGTH_SHORT).show();	
	}

	private void setupListView() {
		ArrayList<String> items = new ArrayList<String>();
		for (int i = 1; i < 7; i++) {
			items.add("Item " + i);
		}
		ArrayAdapter<String> aItems = new ArrayAdapter<String>(this, R.layout.item_simple, items);
		lvItems = (ListView) findViewById(R.id.lvItems);
		lvItems.setAdapter(aItems);
	}


}
