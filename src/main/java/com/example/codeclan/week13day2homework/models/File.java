package com.example.codeclan.week13day2homework.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Column(name = "name")
    private String name;
    @Column(name = "extension")
    private String extension;
    @Column(name = "size")
    private int size;
    @ManyToOne
    @JoinColumn(name="file_id", nullable = false)
    private Folder folder;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public File(String name, String extension, int size, Folder folder){
        this.name=name;
        this.extension=extension;
        this.size=size;
        this.folder=folder;
    }

//    getters
    public String getName() { return name; }
    public Long getId() { return id; }
    public int getSize() { return size; }
    public String getExtension() { return extension; }
    public Folder getFolder() { return folder; }

    //    setters
    public void setName(String name) { this.name = name; }
    public void setId(Long id) { this.id = id; }
    public void setExtension(String extension) { this.extension = extension; }
    public void setSize(int size) { this.size = size; }
    public void setFolder(Folder folder) { this.folder = folder; }

    public File(){}
}
