package com.lz.gambling.application.loteria.adapters.out.postgres.repositories;

import com.lz.gambling.application.loteria.adapters.out.postgres.entities.MegaSenaDrawsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MegaSenaJPARepository extends JpaRepository<MegaSenaDrawsEntity, Long> {}
