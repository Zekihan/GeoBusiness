package com.wambly.GeoBusiness.repository;

import com.wambly.GeoBusiness.model.Business;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BusinessRepository extends MongoRepository<Business, String> {
}