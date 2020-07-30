package com.yxwy.leyi.service.impl;

import com.yxwy.leyi.dao.TDao;
import com.yxwy.leyi.entity.T;
import com.yxwy.leyi.service.TService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TServiceImpl implements TService {
    @Resource
    private TDao dao;
    @Override
    public T findAll() {
        return dao.findAll();
    }
}
