package com.techwave.Models.Dao.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.techwave.Models.Dao.Service.IVendor;
import com.techwave.Models.Pojos.Vendor;

public class VendorServiceImpl implements IVendor  {

	HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public List<Vendor> getAll() {
		// TODO Auto-generated method stub
		List<Vendor> list=template.loadAll(Vendor.class);
		return list;
	}

	@Override
	public Vendor getByVendorId(int id) {
		// TODO Auto-generated method stub
		Vendor v =template.get(Vendor.class,id);
		return v;
	}

	@Override
	@Transactional
	public String insertVenodor(Vendor v) {
		
		template.save(v);
		return "Done";
	}

	
	@Override
	@Transactional
	public String updateVenodor(Vendor v) {
		// TODO Auto-generated method stub
		template.update(v);
		return "done";
	}
	
	
}
