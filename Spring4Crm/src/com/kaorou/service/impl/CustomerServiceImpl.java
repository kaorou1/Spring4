package com.kaorou.service.impl;

import com.kaorou.dao.CustomerDao;
import com.kaorou.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save() {
        customerDao.save();
    }
}
