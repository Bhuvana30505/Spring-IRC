package com.example.Kabbadi1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Kabbadi1.Service.kabbadimatchService;
import com.example.Kabbadi1.model.kabbadimatch;
@RestController
public class KabbadimatchController {
@Autowired
kabbadimatchService Kser;

@PostMapping("/kabba")
public kabbadimatch addDetails(@RequestBody kabbadimatch kr)
{
	return Kser.saveinfo(kr);
 }
}
