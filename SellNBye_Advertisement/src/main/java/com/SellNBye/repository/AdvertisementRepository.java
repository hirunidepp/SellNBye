package com.SellNBye.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SellNBye.model.Advertisement;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

	Advertisement findByAdId(Long adId);

	List<Advertisement> findAll();

	void delete(Advertisement advertisement);


}
