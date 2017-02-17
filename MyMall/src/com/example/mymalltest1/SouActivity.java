package com.example.mymalltest1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SouActivity extends Activity{
	
	private ListView listview; 
	private int[] icons={R.drawable.detail_show1,R.drawable.detail_show2,
		R.drawable.detail_show3,R.drawable.detail_show4,R.drawable.detail_show5,R.drawable.detail_show6};
	private String[] names ={"Conver All Star1","Conver All Star2","Conver All Star3","Conver All Star4",
			"Conver All Star5","Conver All Star6"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mall_sousuo);
		initView();
	}

	public void initView() {
		listview = (ListView) findViewById(R.id.listView1);
		Adapter_listview myadapter = new Adapter_listview();
		listview.setAdapter(myadapter);
		
		
	}
	class Adapter_listview extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return names.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return names[position];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			 View view = View.inflate(SouActivity.this, R.layout.list_item_sousuo, null);
			 ImageView imageView =(ImageView) view.findViewById(R.id.list_item);
			 imageView.setBackgroundResource(icons[position]);
			 TextView  textView = (TextView) view.findViewById(R.id.minchen);
			 textView.setText(names[position]);
			return view;
		}
		
	}
}
  

