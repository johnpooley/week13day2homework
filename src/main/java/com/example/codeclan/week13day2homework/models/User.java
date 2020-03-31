package com.example.codeclan.week13day2homework.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Column(name = "name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User(String name){
        this.name=name;
        this.folders=new ArrayList<>();
    }
    public User(){}

//    getters

    public String getName() { return name; }
    public Long getId() { return id; }
    public List<Folder> getFolders() { return folders; }

//    setters

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setFolders(List<Folder> folders) { this.folders = folders; }

    public void addFolder(Folder folder){this.folders.add(folder);}


}
