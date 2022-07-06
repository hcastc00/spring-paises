package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {

    Iterable<City> findByCountrycode(String countryCode);
}
