package com.example.mymalltest1;

import com.example.Database.MyOpen;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class buyActivity extends Activity implements OnClickListener{
      private EditText et1;
      private EditText et2;
      private String s1;
      private String s2;
      private Button btn1;
      private Button btn2;
      
      
	   @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mall_buy);
		et1 = (EditText) findViewById(R.id.shuliang);
		et1.setOnClickListener(this);
		et2= (EditText) findViewById(R.id.dizhi);
		et2.setOnClickListener(this);
		 btn1 = (Button) findViewById(R.id.queren);
		btn1.setOnClickListener(this);
	   btn2 = (Button) findViewById(R.id.quxiao);
		btn2.setOnClickListener(this);
		LinearLayout ly = (LinearLayout) findViewById(R.id.linearLayout1);
		ly.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.queren:
			Toast.makeText(this, "暂时无法支付", Toast.LENGTH_LONG).show();
			s1 = et1.getText().toString();
			s2 = et2.getText().toString();
			updateData();
			break;

		case R.id.linearLayout1:
			Intent intent=new Intent(this,BabyActivity.class);
			startActivity(intent);
			
			break;
		case R.id.quxiao:
			Intent intent2=new Intent(this,BabyActivity.class);
			startActivity(intent2);
			break;

		}		
	}
	public void updateData()
	{
		MyOpen myopen;
		myopen = new MyOpen(this,"orders.db", null, 3);
		SQLiteDatabase db = myopen.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("shu",s1 );
		values.put("adress", s2);
	   Cursor cursor =db.rawQuery("select * from vcontacts ",null); 
	        cursor.moveToLast();
		db.update("vcontacts", values,"id=?", new String[]{cursor.getString(cursor.getColumnIndex("id"))});
		db.close();
	}
}
