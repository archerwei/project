package com.example.mymalltest1;

import com.example.Database.MyOpen;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class dingactivity extends Activity{
	private TextView tv1;
	private TextView tv2;
	private TextView tv3;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.mall_dingdan);
    	tv1= (TextView) findViewById(R.id.yanse);
    	String s1= getCount1();
        tv1.setText(s1);
        tv2= (TextView) findViewById(R.id.chima);
    	String s2= getCount2();
        tv2.setText(s2);
        tv3= (TextView) findViewById(R.id.number);
    	String s3= getCount3();
        tv3.setText(s3);
    	
    	
    }
     public String getCount1(){  
    	    MyOpen myopen = new MyOpen(this, "orders.db", null, 3);
	        SQLiteDatabase db=myopen.getReadableDatabase();  
	        Cursor cursor =db.rawQuery("select * from vcontacts ",null); 
	        cursor.moveToFirst();
			String reslut=cursor.getString(cursor.getColumnIndex("colors"));  
	        return reslut;  
	    }  
     public String getCount2(){  
 	    MyOpen myopen = new MyOpen(this, "orders.db", null, 3);
	        SQLiteDatabase db=myopen.getReadableDatabase();  
	        Cursor cursor =db.rawQuery("select * from vcontacts ",null); 
	        cursor.moveToFirst();
			String reslut=cursor.getString(cursor.getColumnIndex("size"));  
	        return reslut;  
	    }  
     public String getCount3(){  
  	    MyOpen myopen = new MyOpen(this, "orders.db", null, 3);
 	        SQLiteDatabase db=myopen.getReadableDatabase();  
 	        Cursor cursor =db.rawQuery("select * from vcontacts ",null); 
 	        cursor.moveToLast();
 			String reslut=cursor.getString(cursor.getColumnIndex("shu"));  
 	        return reslut;  
 	    }  
}
