package com.telcel.jtx.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WEB_RULES_LENGTH", schema = "postpago", catalog = "")
public class RulesLengthModel {
    private Integer id;
    private String caracter;
    private String operator;
    private int length;
    private int isRequired;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "length")
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Basic
    @Column(name = "is_required")
    public int getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(int isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RulesLengthModel that = (RulesLengthModel) o;
        return id == that.id &&
                length == that.length &&
                Objects.equals(caracter, that.caracter) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(isRequired, that.isRequired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caracter, operator, length, isRequired);
    }
}
