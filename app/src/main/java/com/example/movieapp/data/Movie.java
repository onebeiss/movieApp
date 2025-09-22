package com.example.movieapp.data;

public class Movie {
    private String title, overview, posterPath;

    public Movie(String title, String overview, String posterPath){
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
    }

    public String getTitle() { return title; }
    public String getOverview() { return overview; }
    public String getPosterPath() { return posterPath; }
}
