package com.frankmoley.lil.landonhotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frankmoley.lil.landonhotel.data.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
