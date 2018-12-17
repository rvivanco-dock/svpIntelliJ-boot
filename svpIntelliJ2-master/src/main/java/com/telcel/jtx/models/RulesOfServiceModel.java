package com.telcel.jtx.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WEB_RULES_OF_SERVICES", schema = "postpago", catalog = "")
public class RulesOfServiceModel {
    private int id;
    private int idService;
    private int idLenght;
    private int idDependency;
    private int idContains;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_service")
    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    @Basic
    @Column(name = "id_lenght")
    public int getIdLenght() {
        return idLenght;
    }

    public void setIdLenght(int idLenght) {
        this.idLenght = idLenght;
    }

    @Basic
    @Column(name = "id_dependency")
    public int getIdDependency() {
        return idDependency;
    }

    public void setIdDependency(int idDependency) {
        this.idDependency = idDependency;
    }

    @Basic
    @Column(name = "id_contains")
    public int getIdContains() {
        return idContains;
    }

    public void setIdContains(int idContains) {
        this.idContains = idContains;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RulesOfServiceModel that = (RulesOfServiceModel) o;
        return id == that.id &&
                Objects.equals(idService, that.idService) &&
                Objects.equals(idLenght, that.idLenght) &&
                Objects.equals(idDependency, that.idDependency) &&
                Objects.equals(idContains, that.idContains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idService, idLenght, idDependency, idContains);
    }
}
