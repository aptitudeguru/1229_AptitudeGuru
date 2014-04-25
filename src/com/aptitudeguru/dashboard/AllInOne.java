package com.aptitudeguru.dashboard;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.TextView;
import androidhive.dashboard.R;

public class AllInOne extends Activity {
	
	CheckBox cbquants;
	 final Context context = this;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.allinone);

		addListenerOnButton();

		
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

	}

	public void addListenerOnButton() {

		final CheckBox cball = (CheckBox) findViewById(R.id.cb_all);
		final CheckBox cbquants = (CheckBox) findViewById(R.id.cb_quants);
		final CheckBox cbc = (CheckBox) findViewById(R.id.cb_c);
		final CheckBox cbcpp = (CheckBox) findViewById(R.id.cb_cpp);

		final CheckBox cbjava = (CheckBox) findViewById(R.id.cb_java);
		final CheckBox cbhtml = (CheckBox) findViewById(R.id.cb_html);
		final CheckBox cbverbal = (CheckBox) findViewById(R.id.cb_vl);
		final CheckBox cbos = (CheckBox) findViewById(R.id.cb_os);
		final CheckBox cbdbms = (CheckBox) findViewById(R.id.cb_dbms);
		final CheckBox cbdsa = (CheckBox) findViewById(R.id.cb_dsa);
		final Button b1 = (Button) findViewById(R.id.startbtn);
		final int selected[] = new int[9];

		cball.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cball.isChecked()) {
					cbquants.setChecked(true);
					cbc.setChecked(true);
					cbcpp.setChecked(true);
					cbjava.setChecked(true);
					cbhtml.setChecked(true);
					cbverbal.setChecked(true);
					cbos.setChecked(true);
					cbdbms.setChecked(true);
					cbdsa.setChecked(true);
				} else {
					cbquants.setChecked(false);
					cbc.setChecked(false);
					cbcpp.setChecked(false);
					cbjava.setChecked(false);
					cbhtml.setChecked(false);
					cbverbal.setChecked(false);
					cbos.setChecked(false);
					cbdbms.setChecked(false);
					cbdsa.setChecked(false);
				}
			}
		});

		b1.setOnClickListener(new OnClickListener() {

			// Run when button is clicked
			@Override
			public void onClick(View v) {

				int s = 0;

				if (cbquants.isChecked()) {
					s = 1;
					selected[0] = 1;
				}
				if (cbc.isChecked()) {
					s = 1;
					selected[1] = 1;
				}
				if (cbcpp.isChecked()) {
					s = 1;
					selected[2] = 1;
				}
				if (cbjava.isChecked()) {
					s = 1;
					selected[3] = 1;
				}
				if (cbhtml.isChecked()) {
					s = 1;
					selected[4] = 1;
				}

				if (cbverbal.isChecked()) {
					s = 1;

					selected[5] = 1;
				}
				if (cbos.isChecked()) {
					s = 1;
					selected[6] = 1;
				}
				if (cbdbms.isChecked()) {
					s = 1;
					selected[7] = 1;
				}
				if (cbdsa.isChecked()) {
					s = 1;
					selected[8] = 1;
				}
				
				
				if(s==0)
				{
					AlertDialog alertDialog = new AlertDialog.Builder(
		                    AllInOne.this).create();

		              
			     
			    			
			    			TextView title = new TextView(context);
				            title.setText("Warning");
				            title.setBackgroundColor(Color.DKGRAY);
				            title.setPadding(10, 10, 10, 10);
				            title.setGravity(Gravity.CENTER);
				            title.setTextColor(Color.WHITE);
				            title.setTextSize(20);
				            alertDialog.setCustomTitle(title);
				         	
				            
		     		                  alertDialog.setMessage("Select Atleast One Test");
		                
		                  
		                  alertDialog.setIcon(R.drawable.about);

		                  
		                  alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		                	  public void onClick(DialogInterface dialog, int which) {
		                		  
		                		  Intent i = new Intent(getApplicationContext(),
		          						AllInOne.class);
		                		  i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		                		  startActivity(i);
		                		  
		                	  }
		    });

		    // Showing Alert Message
		    alertDialog.show();
				}
				else
				{
				Intent i = new Intent(getApplicationContext(),
						TestPageallinone.class);
				i.putExtra("selected", selected);
				cbquants.setChecked(false);
				cball.setChecked(false);
				cbc.setChecked(false);
				cbcpp.setChecked(false);
				cbjava.setChecked(false);
				cbhtml.setChecked(false);
				cbverbal.setChecked(false);
				cbos.setChecked(false);
				cbdbms.setChecked(false);
				cbdsa.setChecked(false);
				startActivity(i);
				}
			}
		});

	}
}
