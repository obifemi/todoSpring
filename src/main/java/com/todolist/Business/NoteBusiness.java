package com.todolist.Business;

import com.todolist.Entity.Note;

import java.util.List;

public interface NoteBusiness {
    void add(Note note);
    void delete(Note note);
    void update(Note note);
    List<Note> getAll();
}
