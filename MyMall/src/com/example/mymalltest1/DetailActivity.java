package com.example.mymalltest1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DetailActivity extends Activity implements OnClickListener  {
	      
	  private Button btn1;
	       @Override
	    protected void onCreate(Bundle savedInstanceState) {
	    	super.onCreate(savedInstanceState);
	    	setContentView(R.layout.mall_cart_y);
	    	btn1= (Button) findViewById(R.id.size35);
	    	btn1.setOnClickListener(this);
	    }
		@Override
		public void onClick(View v) {
		  
			Toast y = Toast.makeText(this,"暂时无法结算",Toast.LENGTH_LONG);
			y.show();
		}
    
}
