package com.restApi.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restApi.Entities.bookRecords;
import com.restApi.dao.CrudRepos;

@RestController
public class bookController {
	
	@Autowired
	private CrudRepos crudRepos;
	
	@PostMapping("/add")
	public bookRecords addBookRecords(@RequestBody bookRecords newbookrecord) {
		
		bookRecords books=new bookRecords();
		books.setNameOfName(newbookrecord.getNameOfName());
		books.setAutherName(newbookrecord.getAutherName());
		crudRepos.save(books);
		
		return books;
		
		
	}
	
	@GetMapping("/views")
	public @ResponseBody Iterable<bookRecords> gellAllbooks(){
		return crudRepos .findAll();
	}
	
	@GetMapping("/view/{id}")
	
		public Optional<bookRecords> getbookRecordById(@PathVariable Integer id){
			return crudRepos.findById(id);
			
		
		}
		@DeleteMapping("delete/all")
		public String deleteall()
		{
			crudRepos.deleteAll();
			return"Delete all records";
		}
		
		@DeleteMapping("delete/{id}")
		public String delete(@PathVariable Integer id) {
			crudRepos.deleteById(id);
			return"Succesfully deleted Id";
		}
	
	
	

}
