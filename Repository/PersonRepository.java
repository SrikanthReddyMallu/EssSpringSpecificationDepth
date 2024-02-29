package com.example.Specification.Repository;

import com.example.Specification.Entity.Person;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>,JpaSpecificationExecutor<Person>
{
//Person findByFirstName(String name);
}
