package com.imcbb.bean.jedis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author kevin
 */
@Repository
public interface OrderRepository extends CrudRepository<Order,String> {

}
