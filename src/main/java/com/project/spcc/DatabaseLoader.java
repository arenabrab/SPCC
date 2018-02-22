package com.project.spcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseLoader implements CommandLineRunner{

    private final EmployeeRepo repo;

    @Autowired
    public DatabaseLoader(EmployeeRepo repo){
        this.repo = repo;
    }

    @Override
    public void run(String... string) throws Exception {
        this.repo.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
