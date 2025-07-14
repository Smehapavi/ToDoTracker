package com.example.ToDoTracker.repository;

import com.example.ToDoTracker.model.TodoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<TodoTask,Integer> {
    TodoTask findByname(String name);
}