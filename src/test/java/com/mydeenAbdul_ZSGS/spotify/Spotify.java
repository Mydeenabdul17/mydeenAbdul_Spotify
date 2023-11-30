package com.mydeenAbdul_ZSGS.spotify;

import java.util.Scanner;

import com.mydeenAbdul_ZSGS.spotify.dto.MenuItem;
import com.mydeenAbdul_ZSGS.spotify.listoptions.ListOptions;

public class Spotify {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Spotify spotify=new Spotify();
		spotify.init();
	}

	private void init() {
		int choice;
		ListOptions listOptions=new ListOptions();
		System.out.println("Welcome to Spotify");
		listOptions.addMenuItem(0);
		listOptions.getList(0,0);
		do {
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			if(choice==0) {
				break;
			}else if(choice==9) {
				listOptions.back();
			}else {
				listOptions.addMenuItem(choice);
			}
			MenuItem top=listOptions.top();
			if(top!=null) {
				listOptions.getList(top.getLevel(), top.getChoice());
			}else {
				break;
			}
		} while (choice!=0);
		System.out.println("Thank you for visiting our website...");
	}
}
