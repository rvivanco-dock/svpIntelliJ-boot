package com.telcel.jtx.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WEB_RULES_DEPENDENCY", schema = "postpago", catalog = "")
public class RulesDependencyModel {
    private Integer id;
    private Integer positionA;
    private String caracterA;
    private Integer positionB;
    private String caracterB;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "position_a")
    public Integer getPositionA() {
        return positionA;
    }

    public void setPositionA(Integer positionA) {
        this.positionA = positionA;
    }

    @Basic
    @Column(name = "caracter_a")
    public String getCaracterA() {
        return caracterA;
    }

    public void setCaracterA(String caracterA) {
        this.caracterA = caracterA;
    }

    @Basic
    @Column(name = "position_b")
    public Integer getPositionB() {
        return positionB;
    }

    public void setPositionB(Integer positionB) {
        this.positionB = positionB;
    }

    @Basic
    @Column(name = "caracter_b")
    public String getCaracterB() {
        return caracterB;
    }

    public void setCaracterB(String caracterB) {
        this.caracterB = caracterB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RulesDependencyModel that = (RulesDependencyModel) o;
        return id == that.id &&
                Objects.equals(positionA, that.positionA) &&
                Objects.equals(caracterA, that.caracterA) &&
                Objects.equals(positionB, that.positionB) &&
                Objects.equals(caracterB, that.caracterB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positionA, caracterA, positionB, caracterB);
    }
}
