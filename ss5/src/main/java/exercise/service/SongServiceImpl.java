package exercise.service;

import exercise.entity.Song;
import exercise.repository.SongRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Autowired
    private SongRepositoty songRepositoty;
    @Override
    public List<Song> findAll() {
        return songRepositoty.findAll();
    }

    @Override
    public Song findById(String id) {
        return songRepositoty.findById(id);
    }

    @Override
    public void create(Song song) {
        songRepositoty.create(song);
    }

    @Override
    public void delete(Song song) {
        songRepositoty.delete(song);
    }
}
