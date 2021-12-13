package com.aemsite.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Test{

    @Inject
    private List<ResourcePathModel> items;

    public List<ResourcePathModel> getItems(){
        return new ArrayList<>(items);
    }
}
