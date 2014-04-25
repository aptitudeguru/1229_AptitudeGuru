package com.aptitudeguru.dashboard;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidhive.dashboard.R;

public class Langjava extends Language {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.app_java);

		
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
		
		Button btn_j1 = (Button) findViewById(R.id.btn_j1);
		Button btn_j3 = (Button) findViewById(R.id.btn_j3);
		Button btn_j5 = (Button) findViewById(R.id.btn_j5);
		Button btn_j7 = (Button) findViewById(R.id.btn_j7);
		Button btn_j9 = (Button) findViewById(R.id.btn_j9);
		
		btn_j1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "j1";
						
						Intent i = new Intent(getApplicationContext(), TestPagejava.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});
		
		btn_j3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "j3";
						
						Intent i = new Intent(getApplicationContext(), TestPagejava.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});

		btn_j5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "j5";
						
						Intent i = new Intent(getApplicationContext(), TestPagejava.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});

		btn_j7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "j7";
						
						Intent i = new Intent(getApplicationContext(), TestPagejava.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});

		btn_j9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				
						String cat = "j9";
						
						Intent i = new Intent(getApplicationContext(), TestPagejava.class);
						i.putExtra("cat", cat);

						startActivity(i);
				

			}
		});


	}

}
