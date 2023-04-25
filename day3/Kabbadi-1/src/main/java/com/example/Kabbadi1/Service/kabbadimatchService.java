package com.example.Kabbadi1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kabbadi1.Repository.kabbadimatchRepo;
import com.example.Kabbadi1.model.kabbadimatch;
@Service
public class kabbadimatchService{
	@Autowired
	kabbadimatchRepo liger;
	public kabbadimatch saveinfo(kabbadimatch k)
	{
		return liger.save(k);

	
}

public List<kabbadimatch>getInfo()
{
	return liger.findAll();
}
}