package com.example.Kabbadi1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Kabbadi1.Repository.LoginRepo;
import com.example.Kabbadi1.model.LoginPage;

@Service
public class LoginService {
	@Autowired
	private LoginRepo lrepo;
		public String checkLogin(String username,String password)
		{
			LoginPage user=lrepo.findByusername(username);
			if(user==null)
			{
				return"No user Found";
			}
			else
			{
				if(user.getPassword().equals(password))
				{
                     return"Login sucessful";
			}
				else
				{
					return "Login Failed";
				}
		}
	}
	public LoginPage adduser(LoginPage lp)
	{
		return lrepo.save(lp);
		}
	public List<LoginPage>getuser()
	{
		return lrepo.findAll();
	}
	public LoginPage adddetails(LoginPage id) {
		// TODO Auto-generated method stub
		return lrepo.save(id);
	}
}
