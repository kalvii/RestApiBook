package com.restApi.dao;

import org.springframework.data.repository.CrudRepository;

import com.restApi.Entities.bookRecords;

public interface CrudRepos extends CrudRepository<bookRecords, Integer> {

}
