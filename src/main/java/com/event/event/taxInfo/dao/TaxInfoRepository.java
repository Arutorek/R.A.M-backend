package com.event.event.taxInfo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxInfoRepository extends CrudRepository<TaxInfoModel, Integer> {
}
