package com.example.codeclan.week13day2homework.repositories;

import com.example.codeclan.week13day2homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
