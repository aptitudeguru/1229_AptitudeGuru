package com.aptitudeguru.dashboard;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Langcpp extends Language {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_cpp);

	
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

		// Listening Friends button click
		btn_fav.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			
				Intent i = new Intent(getApplicationContext(), FavPage.class);

				startActivity(i);
			}
		});

		// Listening Messages button click
		btn_score.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), scoremenu.class);
				startActivity(i);
			}
		});

		// Listening to Places button click
		btn_tutorial.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(),
						Tutorialpage.class);
				startActivity(i);
			}
		});

		// Listening to Events button click
		btn_about.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				Intent i = new Intent(getApplicationContext(), AboutUs.class);
				startActivity(i);
			}
		});
		Button btn_cpp1 = (Button) findViewById(R.id.btn_cpp1);
		Button btn_cpp2 = (Button) findViewById(R.id.btn_cpp2);
		Button btn_cpp3 = (Button) findViewById(R.id.btn_cpp3);
		Button btn_cpp4 = (Button) findViewById(R.id.btn_cpp4);
		Button btn_cpp5 = (Button) findViewById(R.id.btn_cpp5);
		Button btn_cpp6 = (Button) findViewById(R.id.btn_cpp6);
		Button btn_cpp7 = (Button) findViewById(R.id.btn_cpp7);
		btn_cpp1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
				String cat = "cpp1";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp2";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp3";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp4";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp5";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp6";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});
		btn_cpp7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				 
				String cat = "cpp7";
				 
				Intent i = new Intent(getApplicationContext(),
						TestPagecpp.class);
				i.putExtra("cat", cat);

				startActivity(i);

			}
		});

	}

}
