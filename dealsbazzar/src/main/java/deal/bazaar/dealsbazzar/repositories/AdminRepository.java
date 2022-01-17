package deal.bazaar.dealsbazzar.repositories;

import deal.bazaar.dealsbazzar.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository <Admin,String> {
    Admin findByUserNameAndPassword(String userName, String password);
}
