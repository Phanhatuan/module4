package exercise.repository;

import exercise.entity.Song;

import java.util.List;

public interface SongRepositoty {
    List<Song> findAll();

    Song findById(String id);

    void create(Song song);

    void delete(Song song);
}
