package com.techwave.Models.Dao.Service;

import java.util.List;

import com.techwave.Models.Pojos.Vendor;

public interface IVendor {
	List<Vendor> getAll();
	Vendor getByVendorId(int id);
	String insertVenodor(Vendor v);
	String updateVenodor(Vendor v);
}
