package com.company.advanced_with_java.collections.repository.impl;

import com.company.advanced_with_java.collections.AtmCollection;
import com.company.advanced_with_java.collections.atm.domain.Account;
import com.company.advanced_with_java.collections.atm.domain.Treasure;
import com.company.advanced_with_java.collections.atm.store.Storage;
import com.company.advanced_with_java.collections.repository.StorageRepository;

public class InMemoryRepository implements StorageRepository {
    @Override
    public AtmCollection<Account> getAccounts() {
        return Storage.getAccounts();
    }

    @Override
    public AtmCollection<Treasure> getTreasures() {
        return Storage.getTreasures();
    }
}
