package deal.bazaar.dealsbazzar.services;

import deal.bazaar.dealsbazzar.models.Admin;
import deal.bazaar.dealsbazzar.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin addAdminUser(Admin admin){
        return adminRepository.save(admin);
    }

    public boolean validateAdminUser(String userName,String password){
        Admin adminUser=adminRepository.findByUserNameAndPassword(userName,password);
        return adminUser != null;
    }

}
