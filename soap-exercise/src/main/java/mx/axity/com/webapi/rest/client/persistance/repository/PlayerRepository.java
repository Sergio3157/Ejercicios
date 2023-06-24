package mx.axity.com.webapi.rest.client.persistance.repository;

import mx.axity.com.webapi.rest.client.model.PlayerDO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PlayerRepository extends PagingAndSortingRepository<PlayerDO,Integer> {

    Page<PlayerDO> findAllByActiveIsTrue(Pageable pageable );

}
