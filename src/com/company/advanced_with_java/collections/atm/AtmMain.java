package com.company.advanced_with_java.collections.atm;

import com.company.advanced_with_java.collections.impl.ListAtmCollection;

public class AtmMain {

    public static void main(String[] args) {
//
//        StorageRepository storageRepository = StorageFactory.getStorage();
//
//        AtmCollection<Account> accounts = storageRepository.getAccounts();
//        AtmCollection<Treasure> treasures = storageRepository.getTreasures();

        ListAtmCollection listAtmCollection = new ListAtmCollection();
        listAtmCollection.append(1);
        //listAtmCollection.append(2);
        //listAtmCollection.append(3);

        listAtmCollection.remove(1);
        System.out.println();


    }
}
