package spittr.data;

import spittr.Spittle;

import java.util.List;

public class SpittleRepositoryImpl implements SpittleRepository {

    private List<Spittle> spittles;

    public SpittleRepositoryImpl(List<Spittle> spittles) {
        this.spittles = spittles;
    }

    public List<Spittle> findSpittles(long max, int count) {
        return spittles.subList(0, count <= spittles.size() ? count : spittles.size());
    }

    public Spittle findOne(long id) {
        for (Spittle spittle : spittles) {
            if (spittle.getId() == id)
                return spittle;
        }
        return null;
    }
}