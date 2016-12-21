package dao.impl;

import dao.IBaseDao;
import model.Page;

import java.util.List;

/**
 * Created by double on 16-12-21.
 */
public class BaseDao<T> implements IBaseDao<T> {

    @Override
    public void add(T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void load(int id) {

    }

    @Override
    public List<T> list() {
        return null;
    }

    @Override
    public Page<T> pages() {
        return null;
    }
}
