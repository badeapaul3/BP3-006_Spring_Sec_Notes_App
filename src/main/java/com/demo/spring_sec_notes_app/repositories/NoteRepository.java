package com.demo.spring_sec_notes_app.repositories;


import com.demo.spring_sec_notes_app.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUsername(String ownerUsername);
}
