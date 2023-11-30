package com.mydeenAbdul_ZSGS.spotify.dto;

public class MenuItem {
	private int level;
    private int choice;
    private String description;

    public MenuItem() {
    }

    public MenuItem(int level, int choice, String description) {
        this.level = level;
        this.choice = choice;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
