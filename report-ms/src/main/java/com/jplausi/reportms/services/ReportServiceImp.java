package com.jplausi.reportms.services;

import org.springframework.stereotype.Service;

import com.jplausi.reportms.repositories.CompaniesRepository;
import com.netflix.discovery.EurekaClient;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class ReportServiceImp implements ReportService {

    private final CompaniesRepository companiesRepository;

    @Override
    public String makeReport(String name) {
        return this.companiesRepository.getByName(name).orElseThrow().getName();
    }

    @Override
    public String saveReport(String nameReport) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveReport'");
    }

    @Override
    public void deleteReport(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteReport'");
    }
    
}
