package com.example.mymalltest1;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Mall_Main extends FragmentActivity implements OnCheckedChangeListener {
  
	private Mall_Home home; 
	private Mall_Fenlei fenlei;
	private Mall_Cart cart;
	private Mall_User user;
	private RadioGroup rg;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mall_main2);
		initView();
		rg = (RadioGroup) findViewById(R.id.rg_tab);
		rg.setOnCheckedChangeListener((OnCheckedChangeListener) this);
	}
	

	public  void initView() {
			// ��ʼ��Ĭ����ʾ�Ľ���
			if ( home== null) {
				home = new Mall_Home();
				addFragment(home);
				showFragment(home);
			} else {
				showFragment(home);
			}
			
	}


	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.rt1:
			if (home == null) {
				home = new Mall_Home();
	// �жϵ�ǰ�����Ƿ����أ�������ؾͽ��������ʾ��false��ʾ��ʾ��true��ʾ��ǰ��������
				addFragment(home);
				showFragment(home);
			} else {
				if (home.isHidden()) {
					showFragment(home);
				}
			}
			break;
		case R.id.rt2:
			if (fenlei == null) {
				fenlei = new Mall_Fenlei();
				if (!fenlei.isHidden()) {
					addFragment(fenlei);
					showFragment(fenlei);
				}
			} else {
				if (fenlei.isHidden()) {
					showFragment(fenlei);
				}
			}

			break;
		case R.id.rt3:
			if (cart == null) {
				cart = new Mall_Cart();
				if (!cart.isHidden()) {
					addFragment(cart);
					showFragment(cart);
				}
			} else {
				if (cart.isHidden()) {
					showFragment(cart);
				}
			}

			break;
		case R.id.rt4:
			if (user == null) {
				user = new Mall_User();
				if (!user.isHidden()) {
					addFragment(user);
					showFragment(user);
				}
			} else {
				if (user.isHidden()) {
					showFragment(user);
				}
			}
			break;
	
		}
	}
	


	public  void showFragment(Fragment fragment) {
		android.app.FragmentTransaction ft = this.getFragmentManager().beginTransaction();
  // �ж�ҳ���Ƿ��Ѿ�����������Ѿ���������ô�����ص�
		if (home != null) {
			ft.hide(home);
		}
		if (fenlei != null) {
			ft.hide(fenlei);
		}
		if (cart != null) {
			ft.hide(cart);
		}
		if (user != null) {
			ft.hide(user);
		}
		ft.show(fragment);
		ft.commit();
	}
	public  void addFragment(Fragment fragment) {
		android.app.FragmentTransaction ft = this.getFragmentManager().beginTransaction();
		ft.add(R.id.showlayout, fragment);
		ft.commit();
		
	}

}
