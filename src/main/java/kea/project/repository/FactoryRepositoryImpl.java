package kea.project.repository;

import kea.project.model.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;

public class FactoryRepositoryImpl implements IFactoryRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;
    SqlRowSet sqlRowSet;

    @Override
    public void create(Factory factory) {


    }

    @Override
    public Factory read(int id) {
        return null;
    }

    @Override
    public List<Factory> readAll() {
        return null;
    }
}
