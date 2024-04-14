package com.example.cloudcomputing.springdb;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "sv_14_2021") // Set the table name dynamically

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @Column(name = "year")
    private Long year;

    public Movie() {
    }

    public Movie(Long id, String title, String genre, Long year) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Movie(String title, String genre, Long year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}

