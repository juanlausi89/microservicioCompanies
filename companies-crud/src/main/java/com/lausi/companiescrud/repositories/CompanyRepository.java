package com.lausi.companiescrud.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lausi.companiescrud.entities.Company;

public interface CompanyRepository extends JpaRepository<Company,Long> {
    
    Optional<Company> findByName(String name);
}
