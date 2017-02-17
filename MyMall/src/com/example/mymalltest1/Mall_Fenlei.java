package com.example.mymalltest1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Mall_Fenlei extends Fragment{
	
	
	  private ImageView tv1;
	  private ImageView tv2;
	  private ImageView tv3;
	  private ImageView tv4;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = LayoutInflater.from(getActivity()).inflate(R.layout.mall_fenlei, null);
		initView(view);
		return view;
	}
	public void initView(View view)
	{
		
		tv1=(ImageView) view.findViewById(R.id.fenlei1);
		tv1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),SouActivity.class);
				startActivity(intent);
			}
		});
		
		
		tv2=(ImageView) view.findViewById(R.id.shangtu);
		tv2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),SouActivity.class);
				startActivity(intent);
			}
		});
		
		
		tv3=(ImageView) view.findViewById(R.id.imageView3);
		tv3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),SouActivity.class);
				startActivity(intent);
			}
		});
		
		
		tv4=(ImageView) view.findViewById(R.id.imageView4);
		tv4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),SouActivity.class);
				startActivity(intent);
			}
		});
	}
}
