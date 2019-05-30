package com.JaeZuchowski.backend_healthtracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    DiaryRepo diaryRepo;

    @PostMapping("/post")
    public Diary createDiary(
            @RequestBody Diary diary
    ) {
        diary = diaryRepo.save(diary);
        return diary;
    }

    @GetMapping("/get")
    public List getDiaryResults() {
        return diaryRepo.findAll();
    }
}
