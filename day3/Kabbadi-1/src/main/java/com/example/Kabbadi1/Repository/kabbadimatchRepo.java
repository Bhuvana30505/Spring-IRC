package com.example.Kabbadi1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Kabbadi1.model.kabbadimatch;

import jakarta.transaction.Transactional;
public interface kabbadimatchRepo extends JpaRepository<kabbadimatch, Integer>{

	@Query(value="select *from kabbadimatch",nativeQuery=true)
	public List<kabbadimatch>getAllData();
	@Query(value="select * from kabbadimatch where id=:id",nativeQuery=true)
	public List<kabbadimatch>byhouse(@Param("id")int id);
	@Query(value="select * from kabbadimatch where id between ?1 and ?2",nativeQuery=true)
	List<kabbadimatch>startEnd(@Param("start")int start,@Param("end")int end);
	@Modifying
	@Transactional
	@Query(value="delete from kabbadimatch where id=?1 ",nativeQuery=true)
	Integer deleteid(@Param("id")int id);
	

//jpQlQueries
	@Query("select K from kabbadimatch K where id=?1")
	public List<kabbadimatch>getdetails(@Param("id")int id);
   @Query("select J from kabbadimatch J where id between ?1 and ?2")
   public List<kabbadimatch>getbtw(@Param("id")int start,@Param("id")int end);
 
   @Modifying
   @Transactional
   @Query("delete from kabbadimatch where id=?1")
   public void deletejpql(@Param("id")int id);
 
 
  @Modifying
  @Transactional
  @Query("update kabbadimatch c set c.name=:name where c.id=:id")
   public void updateByQuery(@Param("name")String name,@Param("id")int id);
     }
	
 