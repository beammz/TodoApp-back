package com.example.todoappbackend.model;

import javax.persistence.Entity;

/*
	Author: Beatriz Medeiros Mazieri
	This class basically holds entire data of that particularly to-do item
*/

@Entity
public class TodoItem {

	private Long id;
	private String title;
	private boolean done;
	
	public TodoItem(Long id, String title, boolean done) {
		this.id = id;
		this.title = title;
		this.done = done;
	}	
	
	
	
}
