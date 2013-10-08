package com.yahoo.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Float;
import java.lang.NumberFormatException;
//import java.util.Locale;

public class TipCalculatorActivity extends Activity {

	final float TIP_PERCENTAGE_10 = (float) 0.1;
	final float TIP_PERCENTAGE_15 = (float) 0.15;
	final float TIP_PERCENTAGE_20 = (float) 0.2;
	
	public EditText etTotalAmount;
	public TextView tvTipAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
		etTotalAmount = (EditText) findViewById(R.id.etTotalAmount);
		tvTipAmount = (TextView) findViewById(R.id.tvTipAmount);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}

	public void show10PercentTipAmount(View v) {
		try {
			Float totalAmount = Float.valueOf(etTotalAmount.getText().toString());
			Float tip = TIP_PERCENTAGE_10 * totalAmount.floatValue();
			String tipString = String.format(this.getResources().getString(R.string.tip_format), tip.floatValue());
			tvTipAmount.setText(tipString);
		}
		catch (NumberFormatException e) {
			tvTipAmount.setText("");
		}
	}
	
	public void show15PercentTipAmount(View v) {
		try {
			Float totalAmount = Float.valueOf(etTotalAmount.getText().toString());
			Float tip = TIP_PERCENTAGE_15 * totalAmount.floatValue();
			String tipString = String.format(this.getResources().getString(R.string.tip_format), tip.floatValue());
			tvTipAmount.setText(tipString);
		}
		catch (NumberFormatException e) {
			tvTipAmount.setText("");
		}
	}
	
	public void show20PercentTipAmount(View v) {
		try {
			Float totalAmount = Float.valueOf(etTotalAmount.getText().toString());
			Float tip = TIP_PERCENTAGE_20 * totalAmount.floatValue();
			String tipString = String.format(this.getResources().getString(R.string.tip_format), tip.floatValue());
			tvTipAmount.setText(tipString);
		}
		catch (NumberFormatException e) {
			tvTipAmount.setText("");
		}
	}
}
