package com.example.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class MyOpen extends SQLiteOpenHelper{
	
	

	public MyOpen(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		
	}
    
	public MyOpen(Context context)
	{
		super(context,"orders.db",null,3);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("create table vcontacts(id integer primary key autoincrement," +
				" colors varchar(20), size varchar(20),shu varchar(20)," +
				" adress varchar(20))");
		
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
