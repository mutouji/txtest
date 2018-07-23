package com.example.txtest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author mutouji
 */
@Entity
@Table(name = "court")
public class Court implements Serializable {
    @Id
    @NotNull
    private int courtId;

    @NotNull
    private int num;

    public Court() {
    }

    public Court(int courtId, int num) {
        this.courtId = courtId;
        this.num = num;
    }

    public int getCourtId() {
        return courtId;
    }

    public void setCourtId(int courtId) {
        this.courtId = courtId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Court{" +
                "courtId=" + courtId +
                ", num=" + num +
                '}';
    }
}
