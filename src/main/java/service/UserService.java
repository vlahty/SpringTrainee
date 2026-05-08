package service;

import bpp.InjectBean;
import database.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;
import java.util.List;

public class UserService {

    @InjectBean
    @Autowired
    private UserRepository userRepository;

    public void printAll(){
        List.of(userRepository.findAll()).forEach(System.out::println);
    }

}
