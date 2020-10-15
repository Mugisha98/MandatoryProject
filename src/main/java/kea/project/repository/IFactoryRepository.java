package kea.project.repository;

import kea.project.model.Factory;
import java.util.List;

public interface IFactoryRepository {
    void create(Factory factory);
    Factory read(int id);
    List<Factory> readAll();
}
