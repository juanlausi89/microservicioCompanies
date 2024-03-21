package com.jplausi.reportms.models;

import java.io.Serializable;
import lombok.Data;

@Data
public class WebSite implements Serializable {
    
    private Long id;
    private String name;
    private Category category;
    private String description;

}
