package com.example.Kabbadi1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Kabbadi1.Repository.kabbadimatchRepo;
import com.example.Kabbadi1.model.kabbadimatch;
@Service
public class kabbadimatchService{
	@Autowired
	public kabbadimatchRepo liger;
	//posting the info
	public kabbadimatch saveinfo(kabbadimatch k)
	{
		return liger.save(k);

	
}
//getting the info
public List<kabbadimatch>getInfo(){

	return liger.findAll();
}
//put or update
public kabbadimatch updateInfo (kabbadimatch k)
{
    return liger.saveAndFlush(k);	
}
//delete
public List<kabbadimatch>getInfo1(){
	//TODO Auto-generated method stub
	return liger.findAll();
}
  public void deletedetails(int id) {
	//TODO Auto-generated method stub
   liger.deleteById(id);
  }
public kabbadimatch updateinfo(kabbadimatch kb) {
	// TODO Auto-generated method stub
	return liger.saveAndFlush(kb);
}
//pagination
public List<kabbadimatch> pagination(int pgn,int pgs)
{
  Page<kabbadimatch>p=liger.findAll(PageRequest.of(pgn,pgs));
  return p.getContent();
}
//pagination and sorting
public List<kabbadimatch> paginationAndSorting(int pgn, int pgs)
{
	Page<kabbadimatch>P=liger.findAll(PageRequest.of(pgn,pgs));
    return P.getContent(); 
}
//sort Descending order
public List<kabbadimatch> sortDesc(String name) {
	// TODO Auto-generated method stub
	return liger.findAll(Sort.by(name).descending());
}
//sort Ascending order
public List<kabbadimatch> sortAsc(String id) {
	// TODO Auto-generated method stub
	return liger.findAll(Sort.by (id).ascending());
}
public kabbadimatch updatecounter(kabbadimatch k)
{
	return liger.saveAndFlush(k);
  
}
public Optional<kabbadimatch> getdetails(int id) {
	// TODO Auto-generated method stub
	return liger.findById(id);
}

}