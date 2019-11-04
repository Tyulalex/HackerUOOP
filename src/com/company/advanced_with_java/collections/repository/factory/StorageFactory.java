package com.company.advanced_with_java.collections.repository.factory;

import com.company.advanced_with_java.collections.repository.StorageRepository;
import com.company.advanced_with_java.collections.repository.impl.InMemoryRepository;

public class StorageFactory {

    public static StorageRepository getStorage() {
        return new InMemoryRepository();
    }
}
