package com.company.advanced_with_java.collections.repository;

import com.company.advanced_with_java.collections.AtmCollection;
import com.company.advanced_with_java.collections.atm.domain.Account;
import com.company.advanced_with_java.collections.atm.domain.Treasure;

public interface StorageRepository {

    AtmCollection<Account> getAccounts();
    AtmCollection<Treasure> getTreasures();
}
