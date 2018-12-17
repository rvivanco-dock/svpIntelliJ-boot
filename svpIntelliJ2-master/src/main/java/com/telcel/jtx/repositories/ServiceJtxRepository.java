package com.telcel.jtx.repositories;

import com.telcel.jtx.models.ServicesJtxModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceJtxRepository extends JpaRepository<ServicesJtxModel,Integer> {

    public List<ServicesJtxModel> findByName(String name);

    @Query(value = "SELECT s from ServicesJtxModel s where s.type=:type")
    public List<ServicesJtxModel> findByType(@Param("type") Long type);
}
