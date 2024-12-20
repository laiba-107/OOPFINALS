package com.example.oopfinalpaper.controller;

import com.example.oopfinalpaper.model.Event;
import com.example.oopfinalpaper.service.EventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/past")
    public List<Event> getPastEvents() {
        return eventService.getPastEvents();
    }

    @PostMapping("/{id}/book")
    public Event bookTicket(@PathVariable Long id) {
        return eventService.bookTicket(id);
    }
}
