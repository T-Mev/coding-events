package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events", events);

        Map<String, String> events = new HashMap<>();
        events.put("Proforma Code Kata", "Monthly meetups for developers to practice coding exercises with peers and mentors.");
        events.put("LaunchCode", "Nonprofit organization helping people learn to code.");
        events.put("Thinkful Tampa", "Bootcamp-style program in Tampa with a Tuition Guarantee.");
        model.addAttribute("events", events);
        return "events/index";
    }

}