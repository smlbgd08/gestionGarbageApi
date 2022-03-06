package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GarbageRepository;
import com.example.demo.model.Garbage;

@RestController
@CrossOrigin("*")
public class GarbageController {
	
	
	@Autowired
	private GarbageRepository garbageRepository;
	
	
	@RequestMapping(value="/garbage" , method=RequestMethod.GET)
	@Scheduled(fixedRate = 6000)
    public List<Garbage> getAllGarbage()
    {
		System.out.println("here");
    	List<Garbage> list =   garbageRepository.findAll();
    	return list ;
    }
	
	@RequestMapping(value="/garbage/{id}" , method=RequestMethod.GET)
    public Garbage getOne(@PathVariable("id") int id)
    {
    	Garbage garbage =   garbageRepository.findById(id).get();
    	return garbage ;
    }
    
    @RequestMapping(value="/garbage" , method=RequestMethod.POST)
    public Garbage saveGarbage(@RequestBody Garbage garbage )
    {
    	 garbage  = garbageRepository.save(garbage);
    	return garbage ;
    }
    
    @RequestMapping(value="/garbage" , method=RequestMethod.PUT)
    public Garbage updateGarbage(@RequestBody Garbage garbage )
    {
    	 garbage  = garbageRepository.saveAndFlush(garbage);
    	return garbage ;
    }
    
    @RequestMapping(value="/garbage" , method=RequestMethod.DELETE)
    public void delete(@RequestBody Garbage garbage )
    {
    	  garbageRepository.delete(garbage);
    }
	
	
	

}
