package alcor.repository;

import alcor.model.Beverage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "beverages", path = "beverages")
@Repository
public interface BeverageRepository extends MongoRepository<Beverage, String> {
    List<Beverage> deleteByName(String name);

//    List<Beverage> findByNameList(List<String> names);

    Beverage findByName(String name);
}