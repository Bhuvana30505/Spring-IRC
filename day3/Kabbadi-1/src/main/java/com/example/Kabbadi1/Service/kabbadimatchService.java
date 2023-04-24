package com.example.Kabbadi1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kabbadi1.Repository.kabbadimatchRepo;
import com.example.Kabbadi1.model.kabbadimatch;
@Service
public class kabbadimatchService{
	@Autowired
	public kabbadimatchRepo liger;
	public kabbadimatch saveinfo(kabbadimatch k)
	{
		return liger.save(k);

	
}

public List<Kabbadimatch>getInfo()
{
	return krepo.findAll();
}