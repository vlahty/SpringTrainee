package repository;

import database.User;

import java.util.List;
import java.util.Optional;

public class UserRepository implements Repository {

    public List<User> findAll(){
        return List.of(new User("Ivan", 23), new User("Anna", 15), new User("David", 44));
    }

    @Override
    public Optional findById(Object id) {
        return Optional.of(new User("null", 0));
    }

    @Override
    public void delete(Object entity) {

    }
}
