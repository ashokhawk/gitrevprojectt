package com.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gst.entity.Gst;
import com.gst.service.GstService;

@RestController
public class GstController {
	
	@Autowired
	GstService gs;
	
	@PostMapping(value="/setGst")
	public String setGst(@RequestBody Gst g) {
		return gs.setGst(g);
	}
	
	@PostMapping(value="/setGsts")
	public String setGsts(@RequestBody List<Gst> g) {
		return gs.setGsts(g);
	}
	
	@GetMapping(value = "/getGsts")
	public List<Gst> getGsts() {
		return gs.getGsts();
	}
	
	@GetMapping(value = "/getById/{id}")
	public Gst getById(@PathVariable int id) {
		return gs.getById(id);
	}
	
	@GetMapping(value = "/getByHsn/{hsn}")
	public List<Gst> getByHsn(@PathVariable int hsn) {
		return gs.getByHsn(hsn);
	}
	
	@GetMapping(value = "/getTaxByHsn/{hsn}")
	public int getTaxByHsn(@PathVariable int hsn) {
		return gs.getTaxByHsn(hsn);
	}
	
	
	
}


