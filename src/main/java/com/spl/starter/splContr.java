package com.spl.starter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class splContr {
		
		@Autowired
		private splService splservice;
		
		//crossorigin is to run application on a VM
		@CrossOrigin(maxAge=30)
		@RequestMapping("/hello")
		public String sayhi() {
			return "hi";
		}
		
	
		@CrossOrigin(origins = "http://10.62.0.70:4200/archieve")
		@RequestMapping("/webArchive")
		public List<spl> getAllrfp(){
			return splservice.getAllevents();
		}
		
		@CrossOrigin(origins = "http://10.62.0.70:4200/archieve")
		@RequestMapping("/webArchive/{id}")
		public Optional<spl> getrfp(@PathVariable String id) {
			
			return splservice.getevents(id);
		}
		
		@CrossOrigin(origins = "http://10.62.0.70:4200")
		@RequestMapping(method=RequestMethod.POST, value="/webArchive")
		
		public void addrfp(@RequestBody spl spl) {
			splservice.addevents(spl);
		}
		
		@CrossOrigin(origins = "http://10.62.0.70:4200")
		@RequestMapping(method=RequestMethod.PUT, value="/webArchive/{id}")
		public void updaterfp(@RequestBody spl spl, @PathVariable String id) {
			splservice.update(id, spl);
		}
		
		@CrossOrigin(origins = "http://10.62.0.70:4200")
		@RequestMapping(method=RequestMethod.DELETE, value="/webArchive/{id}")
		public void deleterfp(@PathVariable String id) {
			
			splservice.deleteevents(id);
		}

				
	}

	
