package deal.bazaar.dealsbazzar.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import deal.bazaar.dealsbazzar.models.User;

public interface UserRepo extends MongoRepository<User, String> {

}
