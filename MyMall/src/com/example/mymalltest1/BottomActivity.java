package com.example.mymalltest1;

import com.example.Database.MyOpen;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BottomActivity extends Activity implements OnClickListener {
  
	
	private Button[] btn=new Button[14];
	private Button[] btn2=new Button[3];
	private Button btn3;
	private int[] yan_id = { R.id.hong,R.id.hei,R.id.huangse};
	private int[] btn_id = { R.id.size35,
			R.id.size36,R.id.size37,R.id.size38,R.id.size39,R.id.size40,
			R.id.size41,R.id.size42,R.id.size43,R.id.size44};
	private String s1 ;
	private String s2 ;
	
	   @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_bottom);
		btn3 = (Button) findViewById(R.id.button11);
		btn3.setOnClickListener(this);
	         for(int i=0;i<btn_id.length;i++){
		   btn[i]=(Button) findViewById(btn_id[i]);
		   btn[i].setOnClickListener(this);
	   }
	         for(int i=0;i<yan_id.length;i++){
	  		   btn2[i]=(Button) findViewById(yan_id[i]);
	  		   btn2[i].setOnClickListener(this);
	  	   }
	}

	@Override
	public void onClick(View v) {
		
		for(int i=0;i<btn_id.length;i++)
		{
			if(v.getId()== btn_id[i])
			{
				s1 = btn[i].getText().toString();
				btn[i].setAlpha(0.5f);
			}
		}
		for(int i=0;i<yan_id.length;i++)
		{
			if(v.getId()== yan_id[i])
			{
				s2 = btn2[i].getText().toString();
				btn2[i].setAlpha(0.5f);
			}
		}
	    if(v.getId()==R.id.button11)
	    {     
	    	insertData();
			Intent intent =new Intent(this,buyActivity.class);
			startActivity(intent);
	    }
	}
	public void insertData()
	{
		MyOpen myopen;
		myopen = new MyOpen(this,"orders.db", null, 3);
		SQLiteDatabase db = myopen.getWritableDatabase();
		db.execSQL("DELETE FROM vcontacts ");
		ContentValues values = new ContentValues();
		values.put("colors",s2 );
		values.put("size", s1);
	    db.insert("vcontacts", null, values);
		db.close();
	}
}
