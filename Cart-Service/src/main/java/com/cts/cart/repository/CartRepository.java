package com.cts.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.cart.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
