package deal.bazaar.dealsbazzar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import deal.bazaar.dealsbazzar.models.PaymentType;

public interface PaymentTypeRepository extends MongoRepository<PaymentType, String>{
    
}
