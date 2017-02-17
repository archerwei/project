package com.example.mymalltest1;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mall_zhu extends Activity implements OnClickListener{

	 private Button btn;
	 private EditText etNumber;
	 private EditText etPassword ;
	
	   @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mall_zhuce);
		btn = (Button) findViewById(R.id.size35);
		btn.setOnClickListener(this);
	 etNumber = (EditText) findViewById(R.id.zhanghu);
	 etPassword = (EditText) findViewById(R.id.mima);
	}

	@Override
	public void onClick(View v) {
		String number = etNumber.getText().toString().trim();
		String password = etPassword.getText().toString();
		boolean isSaveSuccess = com.example.utils.Utils.saveUserInfo(this, number, password);
		if(isSaveSuccess) {
			Toast.makeText(this, "×¢²á³É¹¦", Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(this, "×¢²áÊ§°Ü", Toast.LENGTH_SHORT).show();
		}
		
	}
}
