package com.mydeenAbdul_ZSGS.spotify.repository;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mydeenAbdul_ZSGS.spotify.dto.MenuItem;

public class SpotifyRepository {

	private static SpotifyRepository repository;
	private Stack<MenuItem> levels=new Stack<MenuItem>();
	private String choices="";
	
	private SpotifyRepository() {
		
	}
	
	public static SpotifyRepository getInstance() {
		if(repository==null) {
			repository=new SpotifyRepository();
		}
		return repository;
	}
	public void insertLevel(MenuItem menuItem) {
		levels.add(menuItem);
	}
	

	public List<String> getChoice(int level, int choice){
		List<String> choiceList=new ArrayList<String>();
		
		 try {
	            ObjectMapper objectMapper = new ObjectMapper();
	            String jsonPath = "spotify_json_files/";  
	            choices+="_choice_" + choice;
	            List<MenuItem> menuItems = Arrays.asList(objectMapper.readValue(
	                    Paths.get(jsonPath + "level_" + level + choices + ".json").toFile(),
	                    MenuItem[].class));

	            for (MenuItem menuItem : menuItems) {
	                choiceList.add(menuItem.getDescription());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		return choiceList;
	}
	
	public int peekLevel() {
		if(levels.isEmpty()) {
			return 0;
		}
		return levels.peek().getLevel()+1;
	}

	public MenuItem top() {
		if(levels.isEmpty()) {
			return null;
		}
		return levels.peek();
	}
	public void back() {
		levels.pop();
        choices=choices.substring(0,choices.length()-18);
	}
}
