package com.aemsite.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class FooterModel1 {
    @Inject
    private String links;

    public String getLinks() {
        
        return links;
    }
}
