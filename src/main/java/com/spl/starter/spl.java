package com.spl.starter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class spl {
	  
	public spl() {
		
	}
	
	
		@Id
		private String id;
		

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}


		public spl(String id, String name, String description, String date, String document) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.date = date;
			this.document = document;
		}


		private String name;
		private String description;
		private String date;
		private String document;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getDocument() {
			return document;
		}

		public void setDocument(String document) {
			this.document = document;
		}
		
	

}
