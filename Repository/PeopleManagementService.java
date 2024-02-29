package com.example.Specification.Repository;

import com.example.Specification.Entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PeopleManagementService extends CrudRepository<Person,Long> {
}
