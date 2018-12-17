package com.telcel.jtx.repositories;

import com.telcel.jtx.models.RulesOfServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RulesServiceRepository extends JpaRepository<RulesOfServiceModel,Integer> {
}
