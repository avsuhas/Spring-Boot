package com.suhas.springdatarest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.suhas.springdatarest.services.UserService;


@RepositoryRestController
public class UserController {

	
	@Autowired
	protected UserService svc;
	
	@Autowired
	private PagedResourcesAssembler<Object> pagedResourcesAssembler;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(method = RequestMethod.GET, value="users")
	  public @ResponseBody ResponseEntity<PagedResources<PersistentEntityResource>> getAll(
	            @RequestParam(value="page") String page, @RequestParam(value="size") String size,
	            PersistentEntityResourceAssembler persistentEntityResourceAssembler) {
	        
	        Page<?> userList = svc.getAll((page == null) ? 0 : Integer.parseInt(page), (size == null) ? 20 : Integer.parseInt(size));
	       
	        return ResponseEntity.ok(pagedResourcesAssembler.toResource((Page<Object>) userList, persistentEntityResourceAssembler));
	    }
	       
	    @RequestMapping(method = RequestMethod.GET, value = "users/{id}")
	    public @ResponseBody ResponseEntity<PersistentEntityResource> getOne(@PathVariable("id") int id,
	            PersistentEntityResourceAssembler persistentEntityResourceAssembler) throws Exception {
	        
	        return ResponseEntity.ok(persistentEntityResourceAssembler.toResource(svc.getOne(id)));
	    }
	  	
	
}
