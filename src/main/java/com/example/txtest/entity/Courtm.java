package com.example.txtest.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Document(collection = "court")
public class Courtm implements Serializable {
    @Id
    @NotNull
    private String courtId;

    @NotNull
    private int num;

    public Courtm() {
    }

    public Courtm(String courtId, int num) {
        this.courtId = courtId;
        this.num = num;
    }

    public String getCourtId() {
        return courtId;
    }

    public void setCourtId(String courtId) {
        this.courtId = courtId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
