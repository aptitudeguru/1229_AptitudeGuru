package com.aptitudeguru.dashboard;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidhive.dashboard.R;


public class Puzzles extends Activity {
	
	int a[];
	TextView t1, t2;
	Button b1, b2, b3;
	int click = 0;
	DatabaseHandler db = new DatabaseHandler(this);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events_layout);
		
		t1 = (TextView) findViewById(R.id.puzzleques);
	
		b1 = (Button) findViewById(R.id.btn_prev1);
		b2 = (Button) findViewById(R.id.btn_next1);
		b3 = (Button) findViewById(R.id.btn_showans);
		
		
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

		
		List<PuzzleTable> quants = db.getAllPuzzle();
		a = new int[quants.size()];
		
		int index = 0;
		for (PuzzleTable cn : quants) {

			a[index++] = cn.getID();

			
			int count = cn.getID();
			String sol1 = cn.getSol();
			String ques = cn.getQues();

		}
		PuzzleTable p = db.getPuzzle(a[0]);
		t1.setText(p.getQues());

		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				if (click == 0) {
					b1.setEnabled(false);
				} else {
					b1.setEnabled(true);
					b2.setEnabled(true);

					click--;
					t1.setText("");
					// t2.setText("");
					PuzzleTable p = db.getPuzzle(a[click]);
					t1.setText(p.getQues());
				}
			}
		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching News Feed Screen
				if (click == 27)
					b2.setEnabled(false);
				else {
					b1.setEnabled(true);
					b2.setEnabled(true);
					click++;
					t1.setText("");
					
					PuzzleTable p = db.getPuzzle(a[click]);
					t1.setText(p.getQues());
				}
			}
		});

		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
			

				Intent i = new Intent(getApplicationContext(), PuzzleSol.class);
				PuzzleTable p = db.getPuzzle(a[click]);
				String sol = p.getSol();
				i.putExtra("sol", sol);
				startActivity(i);
			}
		});
	}
}
