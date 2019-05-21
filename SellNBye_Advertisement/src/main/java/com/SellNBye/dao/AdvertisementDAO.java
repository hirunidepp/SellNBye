package com.SellNBye.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SellNBye.model.Advertisement;
import com.SellNBye.repository.AdvertisementRepository;

@Service
public class AdvertisementDAO {
	
	@Autowired
	AdvertisementRepository advertisementRepository;
	
	/**to save an advertisement*/
	
	public Advertisement save(Advertisement advertisement) {
		// TODO Auto-generated method stub
		return advertisementRepository.save(advertisement);
	}
	
	/**to search an advertisement*/
	
	public List<Advertisement> findAll(){
		return advertisementRepository.findAll();
	}
	
	/**to get an advertisement by id*/
	
	public Advertisement findByAdId(Long adId) {
		return advertisementRepository.findByAdId(adId);
	}
		
	/**to delete an advertisement*/
	
	public void delete(Advertisement advertisement) {
		advertisementRepository.delete(advertisement);
	}

	

		
}
