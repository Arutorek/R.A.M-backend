package com.event.settings.dao;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class SettingsModel {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    String id;

    String resourcesURI;

    public SettingsModel() {
    }

    public SettingsModel(String id, String resourcesURI) {
        this.id = id;
        this.resourcesURI = resourcesURI;
    }

    public SettingsModel(String resourcesURI) {
        this.resourcesURI = resourcesURI;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourcesURI() {
        return resourcesURI;
    }

    public void setResourcesURI(String resourcesURI) {
        this.resourcesURI = resourcesURI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SettingsModel that = (SettingsModel) o;
        return Objects.equals(id, that.id) && Objects.equals(resourcesURI, that.resourcesURI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourcesURI);
    }
}
