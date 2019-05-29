package com.JaeZuchowski.backend_healthtracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DiaryController {

    @Autowired
    DiaryRepo diaryRepo;

    @PostMapping("/DiaryActivity")
    public
}
