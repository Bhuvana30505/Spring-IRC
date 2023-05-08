package com.example.Educationloan.Service;
	import java.util.Optional;



	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.stereotype.Service;

import com.example.Educationloan01.Repository.LoanApplicationRepo;
import com.example.Educationloan01.Repository.UserRepo;
import com.example.Educationloanmodel01.Usermodel;





	




	@Service

	public class loanService {

	 

	 @Autowired

	 

	 public UserRepo repo ;

	 

	 public Usermodel adduser(Usermodel usmodel)

	 {

	 return  repo.save(usmodel);

	 }



	 public Optional<Usermodel> getUsermodelbyId(int id)

	 {

	 return Repe.findById(id);

	 }

	 public Usermodel update (usermodel id)

	 {

	 return Repe.saveAndFlush(id);

	 }

	 public void delete(int id)

	 {

	 Repe.deleteById(id);

	 }

	 

	public LoanApplicationRepo Repe;

	 

	 public LoanApplicationRepo adduser(LoanApplicationRepo usermodel)

	 {

	 return repe.save(usermodel);

	 }



	 public Optional<LoanApplicationRepo> getLoanApplicationbyId(int loanId)

	 {

	 return Repe.findById(loanId);

	 }

	 public LoanApplicationRepo update (LoanApplicationRepo loanId)

	 {

	 return Repe.saveAndFlush(loanId);

	 }

	 public void delete1(int loanId)

	 {

	 Repe.deleteById(loanId);

	 }

	 

	 









}
