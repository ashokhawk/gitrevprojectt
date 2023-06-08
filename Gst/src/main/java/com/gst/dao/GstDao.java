package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.gst.entity.Gst;
import com.gst.repository.GstRepository;

@Repository
public class GstDao {
	
	@Autowired
	GstRepository gr;
	
	public String setGst(@RequestBody Gst g) {
		gr.save(g);
		return "save";
	}
	
	public String setGsts(List<Gst> g) {
		 gr.saveAll(g);
		 return "saved";
	}
	
	
	
	public List<Gst> getGsts() {
		return gr.findAll();
	}
	
	public Gst getById(int id) {
		return gr.findById(id).get();
	}


	public int getTaxByHsn(int hsn) {
		return gr.getTaxByHsn(hsn);
	}


	

	}

