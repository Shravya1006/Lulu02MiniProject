package com.demo.Lulu._Miniproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Lulu._Miniproject.Entity.Clothes;

public interface ClothesRepository extends JpaRepository <Clothes, Integer> {
}

