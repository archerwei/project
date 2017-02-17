package com.example.mymalltest1;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Mall_User extends Fragment{
     
	  private TextView tx1;
	  private TextView tx2;
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = LayoutInflater.from(getActivity()).inflate(R.layout.mall_user, null);
		initView(view);
		return view;
	}
	private void initView(View view) {
		tx1=(TextView) view.findViewById(R.id.shangpin);
		tx1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent1=new Intent(getActivity(),Mall_deng.class);
				startActivity(intent1);
			}
		});
		tx2=(TextView) view.findViewById(R.id.chading);
		tx2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent2=new Intent(getActivity(),dingactivity.class);
				startActivity(intent2);
			}
		});
	 
}
}
