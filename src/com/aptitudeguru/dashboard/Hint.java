package com.aptitudeguru.dashboard;


import android.app.Activity;

import android.os.Bundle;

import android.widget.TextView;
import androidhive.dashboard.R;

public class Hint extends Activity {
	DatabaseHandler db = new DatabaseHandler(this);

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hint);

		Bundle bundle = getIntent().getExtras();
		String category = bundle.getString("cat");
		Tutorial t = new Tutorial();
		Tutorial q = db.getTutorial(category);
		String j = q.getQues();
		TextView t1 = (TextView) findViewById(R.id.hint1);
		t1.setText(j);

	
       
       
		
	}

}
