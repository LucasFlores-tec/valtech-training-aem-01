package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.ButtonModel;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = {Resource.class},
        adapters = {ButtonModel.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ButtonModelImpl implements ButtonModel {

    @ValueMapValue
    private String buttonLabel;

    @ValueMapValue
    private String buttonLink;

    @ValueMapValue
    private boolean buttonOpen;

    @Override
    public String getLabel() {
        return buttonLabel;
    }

    @Override
    public String getLinkURL() {
        return buttonLink;
    }

    @Override
    public String getOpenType() {
        String target = buttonOpen ? "_blank" : "_self";
        return target;
    }
}
