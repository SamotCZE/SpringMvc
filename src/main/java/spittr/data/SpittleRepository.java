package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.List;

/**
 * Created by hudectom on 4.4.2015.
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);
}
