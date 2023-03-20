package exercise.repository;

import exercise.entity.Song;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class SongRepositoryImpl implements SongRepositoty{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Song> findAll() {
        return entityManager.createQuery("select s from Song s").getResultList();
    }

    @Override
    public Song findById(String id) {
        return entityManager.find(Song.class, id);
    }

    @Override
    public void create(Song song) {
        entityManager.persist(song);
    }

    @Override
    public void delete(Song song) {
        entityManager.remove(entityManager.contains(song) ? song : entityManager.merge(song));
    }
}
