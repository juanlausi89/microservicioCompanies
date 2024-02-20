package com.lausi.companiescrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lausi.companiescrud.entities.WebSite;

public interface WebSiteRepository extends JpaRepository<WebSite,Long> {
    
}
