package com.wambly.GeoBusiness.api;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.wambly.GeoBusiness.model.Business;
import com.wambly.GeoBusiness.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/business", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class BusinessMapController {

    @Autowired
    private BusinessRepository businessRepository;

    @GetMapping(value = "/getBusiness")
    public List<Business> getBusiness() {
        return businessRepository.findAll();
    }

    @PostMapping(value = "/addBusiness")
    public Business addBusiness(@RequestBody Business business) {
        businessRepository.insert(business);
        return business;
    }
}
