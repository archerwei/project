package com.example.mymalltest1;

import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mall_deng  extends Activity implements OnClickListener{
	
	private EditText etNumber;
	private EditText etPassword;
	private CheckBox cbRemember;
	private Button bt;
	private Button tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mall_login);
		           initView();
		}

	private void initView() {
		etNumber = (EditText) findViewById(R.id.zhanghu);
		etPassword = (EditText) findViewById(R.id.mima);
		bt = (Button) findViewById(R.id.quxiao);
		bt.setOnClickListener(this);
	    tv = (Button) findViewById(R.id.queren);
		tv.setOnClickListener(this);
	}
    
	public void onClick(View v) {
	        switch (v.getId()) {
			case R.id.quxiao:
		     	String number = etNumber.getText().toString().trim();
				String password = etPassword.getText().toString();
				if(TextUtils.isEmpty(number)) {
					Toast.makeText(this, "«Î ‰»Î’À∫≈", Toast.LENGTH_SHORT).show();
					return;
				}
				if(TextUtils.isEmpty(password)) {
					Toast.makeText(this, "«Î ‰»Î√‹¬Î", Toast.LENGTH_SHORT).show();
					return;
				}
				// –£—È∫≈¬Î∫Õ√‹¬Î «∑Ò’˝»∑
				Map<String, String> userInfo = com.example.utils.Utils.getUserInfo(this);
				String num = userInfo.get("number");
				String pass= userInfo.get("password");
				if(number.equals(num)&&password.equals(pass))
				{
				// µ«¬º≥…π¶
				Toast.makeText(this, "µ«¬º≥…π¶", Toast.LENGTH_SHORT).show();
				}
				else if(!number.equals(num)){
					Toast.makeText(this, "’À∫≈”–ŒÛ", Toast.LENGTH_SHORT).show();
				}
				else if(!password.equals(num))
				{
					Toast.makeText(this, "√‹¬Î¥ÌŒÛ", Toast.LENGTH_SHORT).show();
				}
				break;

			case R.id.queren:
				Intent intent=new Intent(this,Mall_zhu.class);
				startActivity(intent);
				break;
			}
       }
	

}
