package com.xworkz.landrecord.repo;

import com.xworkz.landrecord.dto.AdminDto;

public interface LandRecordRepo {
	
	public AdminDto findByEmail(String email) throws Exception;
	
	public boolean updateOtpByEmail(String otp,String  email);
	
	public AdminDto findOtp(String otp) throws Exception;

}
