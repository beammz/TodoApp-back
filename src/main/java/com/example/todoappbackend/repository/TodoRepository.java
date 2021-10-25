package com.example.todoappbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoappbackend.model.TodoItem;

public interface TodoRepository extends JpaRepository<TodoItem, Long>{
	
	

}
