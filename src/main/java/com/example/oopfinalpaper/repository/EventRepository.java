package com.example.oopfinalpaper.repository;

import com.example.oopfinalpaper.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime; // Make sure this is imported
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByDateTimeBefore(LocalDateTime dateTime);
}
