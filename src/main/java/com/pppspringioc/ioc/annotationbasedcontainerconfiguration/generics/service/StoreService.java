package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pppspringioc.ioc.annotationbasedcontainerconfiguration.generics.domain.Store;

import java.util.List;

@Service
public class StoreService {

    // 단일 제네릭 주입 (Store<String>)
    @Autowired
    private Store<String>/*StringStore*/ stringStore;  // stringStore()가 주입됨
    // <String>의 String이 암시적인 Qualifier역할을 함
    
    // 단일 제네릭 주입 (Store<Integer>)
    @Autowired
    private Store<Integer> integerStore; // integerStore()가 주입됨

    // 컬렉션 주입 (List<Store<Integer>>)
    // <Integer>를 구현한 Store들만 리스트로 주입됨
    @Autowired
    private List<Store<Integer>> integerStores;

    public void testStores() {
        // stringStore
        stringStore.addItem("Hello");
        stringStore.addItem("Generic Qualifier");
        System.out.println("[stringStore] storeType = " + stringStore.storeType());
        System.out.println("[stringStore] getItem(0) = " + stringStore.getItem(0));
        System.out.println("[stringStore] getItem(1) = " + stringStore.getItem(1));

        // integerStore
        integerStore.addItem(100);
        integerStore.addItem(200);
        System.out.println("[integerStore] storeType = " + integerStore.storeType());
        System.out.println("[integerStore] getItem(0) = " + integerStore.getItem(0));
        System.out.println("[integerStore] getItem(1) = " + integerStore.getItem(1));

        // integerStores: Store<Integer> 타입인 빈을 전부 주입
        System.out.println("[integerStores] size = " + integerStores.size());
        for (Store<Integer> store : integerStores) {
            System.out.println("   -> " + store.storeType());
        }
    }
}
