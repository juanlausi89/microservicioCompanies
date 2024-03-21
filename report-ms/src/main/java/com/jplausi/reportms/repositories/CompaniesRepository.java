package com.jplausi.reportms.repositories;

import java.util.Optional;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jplausi.reportms.beans.LoadBalancerConfiguration;
import com.jplausi.reportms.models.Company;

@FeignClient(name="companies-crud")
@LoadBalancerClient(name="companies-crud",configuration = LoadBalancerConfiguration.class)
public interface CompaniesRepository {
    
    @GetMapping(path ="/companies-crud/company/{name}" )
    Optional<Company> getByName(@PathVariable String name);
}
