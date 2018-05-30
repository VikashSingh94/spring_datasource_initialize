package rc.dbinitdemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rc.dbinitdemo.entity.BankAccountEntity;

@Repository
public interface BankAccountRepository extends CrudRepository<BankAccountEntity, Integer> {
}
