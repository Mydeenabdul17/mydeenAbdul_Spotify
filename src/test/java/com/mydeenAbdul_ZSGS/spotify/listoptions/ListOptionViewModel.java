package com.mydeenAbdul_ZSGS.spotify.listoptions;


import java.util.List;

import com.mydeenAbdul_ZSGS.spotify.dto.MenuItem;
import com.mydeenAbdul_ZSGS.spotify.repository.SpotifyRepository;

public class ListOptionViewModel {
	
	private ListOptions listOptions;

	public ListOptionViewModel(ListOptions listOptions) {
		this.listOptions=listOptions;
	}

	public List<String> getList(int i, int j) {
		return SpotifyRepository.getInstance().getChoice(i,j);
	}

	public void addMenuItem(int choice) {
		MenuItem menuItem=new MenuItem(SpotifyRepository.getInstance().peekLevel(),choice,"select option");
		SpotifyRepository.getInstance().insertLevel(menuItem);
	}

	public MenuItem top() {
		return SpotifyRepository.getInstance().top();
	}
	
	public void back() {
		SpotifyRepository.getInstance().back();
	}
	
}
