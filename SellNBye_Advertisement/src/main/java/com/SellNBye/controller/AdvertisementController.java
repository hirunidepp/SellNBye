package com.SellNBye.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SellNBye.dao.AdvertisementDAO;
import com.SellNBye.model.Advertisement;

@RestController
@RequestMapping("/company")
public class AdvertisementController {
	
	@Autowired
	AdvertisementDAO advertisementDAO;
	
	/* to save an advertisement */
	@PostMapping("/advertisements")
	public Advertisement createAdvertisement(@Valid @RequestBody Advertisement advertisement) {
		return advertisementDAO.save(advertisement);
	}
	
	/* get all advertisements */
	@GetMapping("/advertisements")
	public List<Advertisement> getAllAdvertisements(){
		return advertisementDAO.findAll();
	}

	/* get advertisement by adId*/
	@GetMapping("/notes{id}")
	public ResponseEntity<Advertisement> getAdvertisementById(@PathVariable(value="id") Long adId){
		
		Advertisement advertisement=advertisementDAO.findByAdId(adId);
		
		if(advertisement==null) {
			 return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(advertisement); 
	}
	
	/* UPDATE AN EMPLOYEE BY ID */
	
	 @PutMapping("/advertisements/{id}")
	 public ResponseEntity<Advertisement> updateAdvertisement(@PathVariable(value="id") Long adId,@Valid @RequestBody Advertisement advertisementDetails){

		 Advertisement advertisement = advertisementDAO.findByAdId(adId);

		 if(advertisement==null) {
			 return ResponseEntity.notFound().build();
		 }
		 
		 advertisement.setAdTitle(advertisementDetails.getAdTitle());
		 advertisement.setImgLink(advertisementDetails.getImgLink());
		 advertisement.setAdDescription(advertisementDetails.getAdDescription());

		 Advertisement updateAdvertisement=advertisementDAO.save(advertisement);

		 return ResponseEntity.ok().body(updateAdvertisement);
	 }

	 /*DELETE AN EMPLOYEE*/
	 
	 @DeleteMapping("/advertisements/{id}")
	 public ResponseEntity<Advertisement> deleteAdvertisement(@PathVariable(value="id") Long adId){
		 
		 Advertisement advertisement = advertisementDAO.findByAdId(adId);
		 
		 if(advertisement==null) {
			 return ResponseEntity.notFound().build();
		 }
		 advertisementDAO.delete(advertisement);
		return ResponseEntity.ok().build();
	 }
	
}
