package com.gst.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.gst.dao.GstDao;
import com.gst.entity.Gst;

@Service
public class GstService {
	
	@Autowired
	GstDao gd;
	
	public String setGst(Gst g) {
		return gd.setGst(g);
	}
	
	public String setGsts(List<Gst> g) {
		return gd.setGsts(g);
	}

	public List<Gst> getGsts() {
		return gd.getGsts();
	}
	
	
	public Gst getById(int id) {
		return gd.getById(id);
	}

	public List<Gst> getByHsn(int hsn) {
		List<Gst> g=getGsts();
		List<Gst> y=g.stream().filter(x->x.getHsn()==hsn).collect(Collectors.toList());
		return y;
	}
	
	
	
	public int getTaxByHsn(int hsn) {
		return gd.getTaxByHsn(hsn);
}
}