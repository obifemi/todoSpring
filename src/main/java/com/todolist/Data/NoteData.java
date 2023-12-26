package com.todolist.Data;

import com.todolist.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteData extends JpaRepository<Note,String> {
}
