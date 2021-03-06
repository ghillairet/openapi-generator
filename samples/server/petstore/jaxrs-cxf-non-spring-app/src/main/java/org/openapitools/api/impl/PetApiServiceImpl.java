package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.io.File;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * OpenAPI Petstore
 *
 * <p>This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 */
public class PetApiServiceImpl implements PetApi {
    /**
     * Add a new pet to the store
     *
     */
    public void addPet(Pet pet) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Deletes a pet
     *
     */
    public void deletePet(Long petId, String apiKey) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     */
    public List<Pet> findPetsByStatus(List<String> status) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     */
    public List<Pet> findPetsByTags(List<String> tags) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     */
    public Pet getPetById(Long petId) {
        // TODO: Implement...
        
        return null;
    }
    
    /**
     * Update an existing pet
     *
     */
    public void updatePet(Pet pet) {
        // TODO: Implement...
        
        
    }
    
    /**
     * Updates a pet in the store with form data
     *
     */
    public void updatePetWithForm(Long petId, String name, String status) {
        // TODO: Implement...
        
        
    }
    
    /**
     * uploads an image
     *
     */
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata,  Attachment fileDetail) {
        // TODO: Implement...
        
        return null;
    }
    
}

