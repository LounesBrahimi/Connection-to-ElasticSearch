package com.elasticsearch.connection.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.elasticsearch.connection.document.Person;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {
	
}