package com.spring.namuduri.repository;

import com.spring.namuduri.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {

    List<Basket> findBasketByUserId(Long userId);
}
