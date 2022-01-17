package deal.bazaar.dealsbazzar.services;

import java.util.List;
import java.util.UUID;

import deal.bazaar.dealsbazzar.models.Product;
import deal.bazaar.dealsbazzar.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product) {
        product.setProductId(UUID.randomUUID().toString());
        product.setProductStatus(false);
        try {
            Product data = productRepository.insert(product);
            return data;
        } catch (Exception e) {
            return null;
        }

    }

    public List<Product> getProducts() {
        try {
            List<Product> data = productRepository.findAll();
            return data;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean deleteProduct(String productId) {
        try {
            productRepository.deleteById(productId);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public Product validateId(String productId) {
        try {
            return productRepository.findById(productId).get();
        } catch (Exception e) {
            return null;
        }
    }

    public Product updateProduct(Product product) {
        try {
            return productRepository.save(product);
        } catch (Exception e) {
            return null;
        }
    }

}
