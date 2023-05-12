package com.pangan.project.donut;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonutRepository extends MongoRepository<Donut, String> {

}
