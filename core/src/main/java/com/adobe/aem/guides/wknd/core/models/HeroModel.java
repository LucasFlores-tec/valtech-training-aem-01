package com.adobe.aem.guides.wknd.core.models;

/**
 * A sling interface of the Hero component.
 */
public interface HeroModel {

    /**
     * @return a title to display as the Hero's title.
     */
    String getTitle();

    /**
     * @return a description to display as the Hero's description.
     */
    String getDescription();

    /**
     * @return a link reference to the Hero's button.
     */
    String getLinkURL();

    /**
     * @return the image's path reference.
     */
    String getImageReference();

    /**
     * @return the HTML Heading tag type.
     */
    String getType();

    /**
     * @return a boolean sinalizing if the text is rich text or not.
     */
    String getTextIsRich();
}
