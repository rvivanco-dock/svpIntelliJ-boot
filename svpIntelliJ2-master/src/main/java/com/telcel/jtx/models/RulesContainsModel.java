package com.telcel.jtx.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WEB_RULES_CONTAINS", schema = "postpago", catalog = "")
public class RulesContainsModel {
    private long id;
    private String caracter;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "caracter")
    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RulesContainsModel that = (RulesContainsModel) o;
        return id == that.id &&
                Objects.equals(caracter, that.caracter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caracter);
    }
}
