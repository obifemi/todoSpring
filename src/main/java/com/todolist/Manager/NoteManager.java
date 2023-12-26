package com.todolist.Manager;

import com.todolist.Business.NoteBusiness;
import com.todolist.Data.NoteData;
import com.todolist.Entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteManager implements NoteBusiness {
    private NoteData noteData;
    @Autowired
    public NoteManager(NoteData noteData) {

        this.noteData = noteData;

    }


    @Override
    public void add(Note note) {

    }

    @Override
    public void delete(Note note) {

    }

    @Override
    public void update(Note note) {

    }

    @Override
    public List<Note> getAll() {
        return this.noteData.findAll();
    }
}
