package deal.bazaar.dealsbazzar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deal.bazaar.dealsbazzar.models.Category;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{
    
}
