package com.mydeenAbdul_ZSGS.spotify.listoptions;

import com.mydeenAbdul_ZSGS.spotify.dto.MenuItem;

public class ListOptions {

	private ListOptionViewModel listOptionViewModel;
	
	public ListOptions() {
		listOptionViewModel=new ListOptionViewModel(this);
	}
	public void getList(int level, int choice) {
		for(String discription:listOptionViewModel.getList(level,choice)) {
			System.out.println(discription);
		}
	}
	public void addMenuItem(int choice) {
		listOptionViewModel.addMenuItem(choice);
	}
	public MenuItem top() {
		return listOptionViewModel.top();
	}
	public void back() {
		listOptionViewModel.back();
	}
}
