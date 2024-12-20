package com.example.oopfinalpaper.service;

import com.example.oopfinalpaper.model.Event;
import com.example.oopfinalpaper.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public List<Event> getPastEvents() {
        return eventRepository.findByDateTimeBefore(LocalDateTime.now());
    }

    public Event bookTicket(Long eventId) {
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));
        if (event.getTicketsAvailable() > 0) {
            event.setTicketsAvailable(event.getTicketsAvailable() - 1);
            event.setTicketsSold(event.getTicketsSold() + 1);
            return eventRepository.save(event);
        } else {
            throw new RuntimeException("No tickets available");
        }
    }
}
