package com.example.codeclan.week13day2homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderInterface extends JpaRepository<Folder,Long> {
}
