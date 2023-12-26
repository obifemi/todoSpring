package com.todolist.RestApi;

import com.todolist.Business.NoteBusiness;
import com.todolist.Entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/note")
@CrossOrigin
public class NoteApi {
    private NoteBusiness noteService;
@Autowired
    public NoteApi(NoteBusiness noteService) {
        this.noteService = noteService;
    }
@GetMapping("/list")
    public List<Note> get(){
    return this.noteService.getAll();
    }
}
