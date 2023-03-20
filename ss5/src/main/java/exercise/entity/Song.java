package exercise.entity;

import javax.persistence.*;

@Entity
public class Song {

    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    private String name;
    private String singer;
    private String genre;
    private String link;


    public Song() {
    }

    public Song(String id, String name, String singer, String genre, String link) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.genre = genre;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
