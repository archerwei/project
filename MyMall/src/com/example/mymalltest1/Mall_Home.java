package com.example.mymalltest1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Mall_Home extends android.app.Fragment {
	 
	 private TextView  top_title;
	 private ListView listView_tao;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = LayoutInflater.from(getActivity()).inflate(R.layout.mall_home, null);
		initView(view);
		return view;
	}

	private void initView(View view) {
		top_title=(TextView) view.findViewById(R.id.top_title);
		top_title.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(getActivity(),SouActivity.class);
				startActivity(intent);
			}
		});
		listView_tao=(ListView) view.findViewById(R.id.listView_tao);
    	listView_tao.setAdapter(new Adapter_ListView_tao(getActivity()));
    	listView_tao.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				Intent intent=new Intent(getActivity(),BabyActivity.class);
				startActivity(intent);
			}
		});
		
	}

}
