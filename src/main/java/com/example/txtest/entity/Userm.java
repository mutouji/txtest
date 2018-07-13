package com.example.txtest.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Document(collection="user")
public class Userm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private String id;

    @NotNull
    private String courtId;

    @NotNull
    private String userId;

    public Userm() {}

    public Userm(String courtId, String userId) {
        this.courtId = courtId;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourtId() {
        return courtId;
    }

    public void setCourtId(String courtId) {
        this.courtId = courtId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}