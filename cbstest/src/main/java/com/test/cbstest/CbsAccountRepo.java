package com.test.cbstest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CbsAccountRepo extends ReactiveMongoRepository<CbsAccount, Integer> {

	//Flux<CbsAccount> findAllByStatus(String status);

	CbsAccount findOneByAccountNoAndStatus(String accNumber, String status);

	CbsAccount findOneByAccountNoAndMobileNoAndStatus(String accNumber, String mobileNo, String status);

}
