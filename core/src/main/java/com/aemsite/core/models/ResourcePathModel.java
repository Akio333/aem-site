package com.aemsite.core.models;

import javax.inject.Inject;

import com.day.cq.wcm.api.Page;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;




@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ResourcePathModel {


    @ScriptVariable
    ResourceResolver resolver;

    @ScriptVariable
    Page myPage;

    @Inject
    // @Via("resource")
    private String linkUrl;

    public String getUrl(){
       
            Resource resource = resolver.getResource(linkUrl);
            myPage = resource.adaptTo(Page.class);
            return myPage.getPageTitle();
       
       
    }

    // public String getUrl(){
    //     return linkUrl;
    // }

}