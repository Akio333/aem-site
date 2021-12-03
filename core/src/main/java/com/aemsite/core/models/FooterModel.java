package com.aemsite.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class FooterModel {

    @Inject
    private List<FooterModel1> innerGroup;

    public List<FooterModel1> getInnerGroup() {
        return new ArrayList<>(innerGroup);
    }

}
