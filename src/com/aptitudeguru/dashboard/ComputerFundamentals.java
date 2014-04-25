package com.aptitudeguru.dashboard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class ComputerFundamentals extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.places_layout);

		Button btn_dbms = (Button) findViewById(R.id.btn_dbms);
		Button btn_os = (Button) findViewById(R.id.btn_os);
		Button btn_dsa = (Button) findViewById(R.id.btn_dsa);
		
		Button btn_home = (Button) findViewById(R.id.btn_home);

		
		Button btn_fav = (Button) findViewById(R.id.btn_fav);

		
		Button btn_score = (Button) findViewById(R.id.btn_score);

		
		Button btn_tutorial = (Button) findViewById(R.id.btn_soundon);

		
		Button btn_about = (Button) findViewById(R.id.btn_about);
	Button btn_help = (Button) findViewById(R.id.btn_help);
		
		btn_help.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
					Help.class);

				startActivity(i);
			}
		});

		
		btn_home.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						AndroidDashboardDesignActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});

		
		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});

	
		btn_score.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});

		
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
				startActivity(i);
			}
		});

		
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});
		btn_os.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), TestPageos.class);
				startActivity(i);
			}
		});

		btn_dbms.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						TestPagedbms.class);
				startActivity(i);
			}
		});

		btn_dsa.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						TestPagedsa.class);
				startActivity(i);
			}
		});

	}
}
