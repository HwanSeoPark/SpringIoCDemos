package com.pppspringioc.ioc.annotationbasedcontainerconfiguration.usingautowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerPreferenceDaoImpl implements CustomerPreferenceDao {

    @Override
    public String getCustomerPreference() {
        return "Action";  // 예: 사용자가 액션 영화를 선호한다고 가정
    }
}
