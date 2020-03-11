package com.acme.todolist.application.port.in;

import com.acme.todolist.domain.TodoItem;

public interface AddTodoItem {
	
	/**
	 * 
	 * @param
	 */
	void addTodoItem(TodoItem item);

}