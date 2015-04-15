package spittr.data;

import spittr.Spitter;

/**
 * Created by hudectom on 5.4.2015.
 */
public interface SpitterRepository {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
