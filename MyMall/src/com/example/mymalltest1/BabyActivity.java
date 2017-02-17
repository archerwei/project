package com.example.mymalltest1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BabyActivity extends Activity implements OnClickListener{
        
	
	
	   private ListView listView;
	   private String[] names ={"С��","С��","С��",
			   "С��","С��","Сɭ"};
	   private String[] ping ={"����������������","������������","����������������",
			   "��������","����������������","������������"};
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	    	super.onCreate(savedInstanceState);
	    	setContentView(R.layout.mall_baobei);
	    	Button button1 = (Button) findViewById(R.id.qou);
	    	Button button2 = (Button) findViewById(R.id.gou);
	    	button1.setOnClickListener(this);
	        button2.setOnClickListener(this);
            listView = (ListView) findViewById(R.id.listView1);
            listadapter myad = new  listadapter();
            listView.setAdapter(myad);
            setListViewHeight(listView);
	    }

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.qou:
				Intent intent1 =new Intent(this,DetailActivity.class);
				startActivity(intent1);
				break;

			case R.id.gou:
				Intent intent2 =new Intent(this,BottomActivity.class);
				startActivity(intent2);
				break;
			}
		
				
			
		}
	 public void setListViewHeight(ListView listView) {    
	            
		        // ��ȡListView��Ӧ��Adapter    
		        
		        ListAdapter listAdapter = listView.getAdapter();    
		        
		        if (listAdapter == null) {    
		            return;    
		        }    
		        int totalHeight = 0;    
		        for (int i = 0, len = listAdapter.getCount(); i < len; i++) { // listAdapter.getCount()�������������Ŀ    
		            View listItem = listAdapter.getView(i, null, listView);    
		            listItem.measure(0, 0); // ��������View �Ŀ��    
		            totalHeight += listItem.getMeasuredHeight(); // ͳ������������ܸ߶�    
		        }    
		        
		        ViewGroup.LayoutParams params = listView.getLayoutParams();    
		        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));    
		        listView.setLayoutParams(params);    
		    }    
      class listadapter extends BaseAdapter{

		@Override
		public int getCount() {
			return names.length;
		}

		@Override
		public Object getItem(int position) {
			
			return names[position];
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view =View.inflate(BabyActivity.this, R.layout.list_ping2, null);
			TextView tv = (TextView)view.findViewById(R.id.pingjia);
			tv.setText(names[position]);
			TextView tv2 = (TextView)view.findViewById(R.id.pingjia2);
			tv2.setText(ping[position]);
			return view;
		}
    }
}
