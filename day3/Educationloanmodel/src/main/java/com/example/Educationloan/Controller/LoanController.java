package com.example.Educationloan.Controller;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.Educationloan01.Repository.LoanApplicationRepo;

import jakarta.persistence.TableGenerator;



@RestController

@RequestMapping("/user")

public class LoanController {

 private static final CrudRepository<LoanApplicationRepo, Integer> Ser = null;
@Autowired

 public Service ser;


 @GetMapping("/ad")



    public Optional<com.example.Educationloanmodel01.Usermodel>  readbyid(@PathVariable("id")int id)

    {

     return ser.getUsermodelbyId(id);

    }

 

 

 

 

 

 

 

 

 


 @PostMapping("/id")

    public Usermodel create(@RequestBody Usermodel id)

    {

     return ser.adduser(id);



    }

 

  @PutMapping("/id")

     public Usermodel update(@RequestBody Usermodel id)



     {

      return ser.update(id);

     }

  

          @DeleteMapping("/delet")

     public String delete(@PathVariable("id")int id)

     {

      ser.delete(id);



      return "Deletion was successful";

     }

          

       

       @PostMapping("/lid")

          public LoanApplicationRepo create(@RequestBody LoanApplicationRepo loanId)

          {

           return ser.adduser(loanId);

          }

        @PutMapping("/lid")

           public LoanApplicationRepo update(@RequestBody LoanApplicationRepo applicationRepo)

           {

            return ser.update(loanId);

           }

            @DeleteMapping("/delete")

           public String delete1(@PathVariable("loanId")LoanApplicationRepo loanId)

           {

            Ser.delete(loanId);

            return "Deletion was successful";

           }



            @GetMapping("/ladd")

            

            public Optional<LoanApplicationRepo>  readbyid1(@PathVariable("loanId")int loanId)

            {

             return (ser).getLoanApplicationbyId(loanId);

            }

              



}