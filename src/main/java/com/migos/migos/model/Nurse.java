package com.migos.migos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Nurse {
    private final UUID id;
    private final String name;

    public Nurse(@JsonProperty("id") UUID id,
                 @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

