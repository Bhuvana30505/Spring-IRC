package com.example.Kabbadi1.Controller;

import java.util.List;
//import java.util.Map;//
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kabbadi1.Repository.kabbadimatchRepo;
import com.example.Kabbadi1.Service.kabbadimatchService;
import com.example.Kabbadi1.model.kabbadimatch;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
public class KabbadimatchController {
@Autowired
kabbadimatchService Kser;
@Tag(name = "KabbadiDetails",description ="Kabbadi")
@PostMapping("/kabba")
public kabbadimatch addDetails(@RequestBody kabbadimatch kr)
{
	return Kser.saveinfo(kr);
 }
@Tag(name="Getid",description="getdetails endpoint")
@GetMapping("/kabbadimatch/{id}")
public Optional<kabbadimatch> getDetails(@PathVariable ("id")int id)
{
	return Kser.getdetails(id);
}
@Tag(name="updateDetails",description="update Kabbadimatch endpoint")
@PutMapping("/updatekabbadimatch")
public kabbadimatch updatedetails(@RequestBody kabbadimatch kb)
{
	return Kser.updateinfo(kb);
}
@Tag(name="DeleteDetails",description="delete endpoint")
@DeleteMapping("/deletekabbadimatch/{kid}")
 public String deleteDetails  (@PathVariable("kid")int kid)
{
	Kser.deletedetails(kid);
	return "kabbadimatchid"+kid+ "deleted";
 }
//sort by descending order
@Tag(name="sorting",description="Descending")
@GetMapping("/sortDesc/{name}")
public List<kabbadimatch>sortname1(@PathVariable("name")String name)
{
	return Kser.sortDesc(name);
}
//sort by Ascending order
@Tag(name="sorting",description="Ascending")
@GetMapping("/sortAsc/{id})")
public List<kabbadimatch> sortname(@PathVariable("id")String id )
{
  return Kser.sortAsc(id);
}
@Tag(name="Pagination")
@GetMapping("/paggination/{pgn}/{pgs}")
public List<kabbadimatch>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
{
	return Kser.paginationAndSorting(pgn,pgs);    
}
//pagination and sorting
@Tag(name="Pagination and sorting")
@GetMapping("/Pagination/{pgn}/{pgs}/{id}")
public List<kabbadimatch>pagesorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
{
	return Kser.paginationAndSorting(pgn,pgs);
}

@Autowired
public kabbadimatchRepo liger;
@Tag(name="getbyid")
@GetMapping("/byid/{Kabbadimatch}")
public Optional<kabbadimatch> getid(@PathVariable("Kabadimatch")int kabbadimatch){
	return liger.findById(kabbadimatch);
}
@Tag(name="getbykabbadimatch")
@GetMapping("startend//{start}/{end}")
public List<kabbadimatch>startendkabbadimatch(@PathVariable("start")int start,@PathVariable("end")int end){
	return liger.startEnd(start,end);
}
@DeleteMapping("/delete/{id}")
public String deletekabbadimatch(@PathVariable("id")int id){
    liger.deleteid(id);
	return "Deleted";
  }

//jpql

@Tag(name="jpqlget")
@GetMapping("/jpql/between/{start}/{end}")
public List<kabbadimatch>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)
{
	return liger.getbtw(start,end);
}
    @Tag(name="jpqldelete")
	@DeleteMapping("/jpql/{id}")
	public String deletejpql(@PathVariable("id")int id)
	{
		liger.deletejpql(id);
		return"Deleted successfully";
		}
	@Tag(name="jpqlupdate")
	@PutMapping("update/{id}/{name}")
	public String updatejpql(@PathVariable("name")String name,@PathVariable("id")int id)
	{
		liger.updateByQuery(name,id);
		  return "Updated successfully";
	}
}