package exercise.service;

import exercise.entity.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();

    Song findById(String id);

    void create(Song song);

    void delete(Song song);
}
