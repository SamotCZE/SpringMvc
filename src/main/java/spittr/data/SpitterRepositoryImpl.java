package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hudectom on 5.4.2015.
 */
@Component
public class SpitterRepositoryImpl implements SpitterRepository {

    List<Spitter> spitters = new ArrayList<Spitter>();


    public Spitter save(Spitter spitter) {
        spitter.setId(new Random().nextLong());
        spitters.add(spitter);
        return spitter;
    }

    public Spitter findByUsername(String username) {
        for (Spitter spitter : spitters) {
            if (spitter.getUsername().equals(username))
                return spitter;
        }
        return null;
    }
}
