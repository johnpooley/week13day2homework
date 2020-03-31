package com.example.codeclan.week13day2homework.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {

    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "folder")
    private List<File> files;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String name, User user) {
        this.name = name;
        this.files = new ArrayList<>();
        this.user=user;
    }

    public Folder() {
    }


    public Folder(Long id) { this.id = id; }

//  getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<File> getFiles() { return files; }
    public User getUser() { return user; }

    //    setters
    public void setName(String name) { this.name = name; }
    public void setId(Long id) { this.id = id; }
    public void setFiles(List<File> files) { this.files = files; }
    public void setUser(User user) { this.user = user; }

    public void addFile(File file){this.files.add(file);}


}