package com.example.talaba.Repository;

import com.example.talaba.Entity.Talaba;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TalabaRepository extends JpaRepository<Talaba,Integer> {
    boolean existsByEmail(String email);
}
