package com.nt.repsoitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.model.DairyFarm;
@Repository
public interface DairyFarmRepository extends JpaRepository<DairyFarm, Long> {

}
