package repository;


import bpp.InjectBean;
import bpp.Transaction;
import database.Company;
import database.ConnectionPool;
import jakarta.annotation.PostConstruct;

import java.util.Optional;

@Transaction
public class CompanyRepository implements Repository<Integer, Company>{
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init(){
        System.out.println("init");
    }

    @Override
    public Optional<Company> findById(Integer id) {

        System.out.println("findById method");
        return Optional.of(new Company(id));

    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method");
    }
}
