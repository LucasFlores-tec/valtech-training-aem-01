package com.adobe.aem.guides.wknd.core.models;

/**
 * A model to compose with other models in order to create a Button
 */
public interface ButtonModel {

    /**
     * @return a label text to display on the button
     */
    String getLabel();

    /**
     * @return a link to redirect by clicking at the button
     */
    String getLinkURL();

    /**
     * @return a property for the HTML tag target in order to open the link in the same tab or in a new one
     */
    String getOpenType();
}
