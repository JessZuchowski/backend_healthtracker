package com.JaeZuchowski.backend_healthtracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepo extends JpaRepository<Diary, Long> {
}
