	package com.spl.starter;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.bind.annotation.RequestMapping;
	//import com.rfp.starter;

	@Service
	public class splService {

		
		@Autowired
		private splRepo splrepo;
		
		public List<spl> getAllevents() {
			// TODO Auto-generated method stub
			List<spl> events=new ArrayList<>();
			splrepo.findAll().forEach(events::add);
			return events;
			
		}

		public Optional<spl> getevents(String id) {
			// TODO Auto-generated method stub
			return splrepo.findById(id);
			
		}

		public void addevents(spl spl) {
			//topics.add(topic);
			splrepo.save(spl);
			
		}

		public void update(String id,spl spl) {
			splrepo.save(spl);
			
		}

		public void deleteevents(String id) {
			splrepo.deleteById(id);
			
		}


		

	}


