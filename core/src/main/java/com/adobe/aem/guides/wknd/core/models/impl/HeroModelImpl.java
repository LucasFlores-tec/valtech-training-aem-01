package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.HeroModel;
import org.apache.commons.lang3.StringUtils;
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
    private String fileReference;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getLinkURL() { return linkURL; }

    @Override
    public boolean isEmpty() {
        if(StringUtils.isEmpty(title)
                || StringUtils.isEmpty(description)
                || StringUtils.isEmpty(linkURL)
                || StringUtils.isEmpty(fileReference)) {
            return true;
        } else {
            return false;
        }
    }
}
