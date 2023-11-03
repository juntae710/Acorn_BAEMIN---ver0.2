package com.acorn.baemin.selectstrore.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.acorn.baemin.domain.StoreDTO;
import com.acorn.baemin.selectstrore.repository.SelectStrollerRepository;
@Controller
public class SelectStrollerController {
	@Autowired
	SelectStrollerRepository rep;

	@GetMapping("/storeList")
	public String selectStore( Model model) {
		List<StoreDTO> result  = rep.selectStore("치킨");
		model.addAttribute("list", result);
		return "store/store_list";
		}
	
//	@ResponseBody
//	@RequestMapping( value="/sellerHome" , method=RequestMethod.POST)
//	public void insertStore(@RequestBody StoreDTO Store) {
//		rep.insertStore(Store);
//	}
//	
//
//	@ResponseBody
//	@RequestMapping( value="/sellerHome/{storecode}" , method=RequestMethod.DELETE)
//	public void deleteStore(@PathVariable String storecode) {
//		rep.deleteStore(storecode);
//	}
//	
//	@ResponseBody
//	@RequestMapping( value="/sellerHome/{storecode}" , method=RequestMethod.GET)
//	public StoreDTO updateSellerStore(@PathVariable String storecode , Model model){	
//		StoreDTO store = rep.updateSellerStore(storecode);
//		return store;
//	}
//
//	@ResponseBody
//	@RequestMapping( value="/sellerHome" , method=RequestMethod.PUT)
//	public void updateStore(@RequestBody StoreDTO Store) {
//		System.out.println(Store);
//		rep.updateStore(Store);
//	}
	

}
