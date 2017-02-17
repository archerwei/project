package com.example.mymalltest1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class MyListView extends ListView {

	public MyListView(Context context) {
		super(context);//���ø���Ĺ��췽��
	}

	public MyListView(Context context, AttributeSet attrs) {
		super(context, attrs);//���ø���Ĺ��췽��
	}

	public MyListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);//���ø���Ĺ��췽��
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2, MeasureSpec.AT_MOST);

		super.onMeasure(widthMeasureSpec, expandSpec);//����view�Ĵ�С
	}

	

}
