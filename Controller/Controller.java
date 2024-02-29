package com.example.Specification.Controller;

import com.example.Specification.Dto.RequestDto;
import com.example.Specification.Entity.Person;
import com.example.Specification.Repository.PeopleManagementService;
import com.example.Specification.Repository.PersonRepository;
import com.example.Specification.Service.FilterSpecification;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/JpaSpecification")
public class Controller
{

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private FilterSpecification<Person> personFilterSpecification;

        @RequestMapping(value="/specification",
            method = RequestMethod.GET)
    public List<Person> getPerson()
    {
        Specification<Person> specification= new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("id"),"660");
            }

        };
        List<Person> all=personRepository.findAll(specification);
        System.out.println(all);
        return all;
    }


    @RequestMapping(value="/specification1",
         method = RequestMethod.POST)
     public List<Person> getPerson(@RequestBody RequestDto requestDto)
    {
        Specification<Person> searchSpecification=personFilterSpecification.getSearchSpecification(requestDto.getSearchRequestDto());
        return personRepository.findAll(searchSpecification);
    }

    @RequestMapping(value="/specification2",
            method = RequestMethod.POST)
    public List<Person> getPerson2(@RequestBody RequestDto requestDto)
    {
        Specification<Person> searchSpecification=personFilterSpecification.getSearchSpecification1(requestDto.getSearchRequestDto1());
        return personRepository.findAll(searchSpecification);
    }
}
