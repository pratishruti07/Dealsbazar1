package deal.bazaar.dealsbazzar.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import deal.bazaar.dealsbazzar.models.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String>{
    
}
