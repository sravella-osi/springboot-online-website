package com.springboot.website.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private String fieldValue;

    public ResourceNotFoundException(String resourceName,String fieldName, String fieldValue) {

        super(String.format("%s with %s : '%s' is not found", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;

    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }
}
