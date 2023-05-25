package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.HeroModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = { SlingHttpServletRequest.class },
        adapters = { HeroModel.class },
        resourceType = { HeroModelImpl.RESOURCE_TYPE },
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HeroModelImpl implements HeroModel {
    protected static final String RESOURCE_TYPE = "apps/wknd/components/lf_hero";

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String linkURL;

    @ValueMapValue
    private String imageReference;

    @ValueMapValue
    private String type;

    @ValueMapValue
    private String textIsRich;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getLinkURL() {
        return linkURL;
    }

    @Override
    public String getImageReference() {
        return imageReference;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getTextIsRich() {
        return textIsRich;
    }
}
