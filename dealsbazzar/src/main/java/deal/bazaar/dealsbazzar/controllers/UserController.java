package deal.bazaar.dealsbazzar.controllers;

import java.util.List;

import deal.bazaar.dealsbazzar.models.User;
import deal.bazaar.dealsbazzar.repositories.UserRepo;
import deal.bazaar.dealsbazzar.responses.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
@CrossOrigin

public class UserController {
    @Autowired
    UserRepo userRepo;
    
    @PostMapping("/userRegister")
    public Response addUser(@RequestBody User user)
    {
        if(userRepo.count()>0)
        {
            List<User> list= userRepo.findAll();
            for (User user2 : list) {
                if(user2.getEmail().equals(user.getEmail())){
                    return new Response(400, "Already exists", user);
                }
                }
            }
            userRepo.save(user);
        return new Response(200, "registration successfull", user);
    }

    @PostMapping("/userLogin")
    public Response login(@RequestBody User user)
    {
        if(userRepo.count()>0){
            List<User> data = userRepo.findAll();
            for(User user2: data){
                if(user2.getEmail().equals(user.getEmail()) && user2.getPassword().equals(user.getPassword())){
                    return new Response(200,"Login Successfull",user);
                }
            }
        }       
        return new Response(400,"data Not found",user);
    }
    }
   
    
         
         

    
