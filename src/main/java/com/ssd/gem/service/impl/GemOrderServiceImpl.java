package com.ssd.gem.service.impl;

import com.ssd.gem.mbg.mapper.GemOrderMapper;
import com.ssd.gem.mbg.model.GemOrder;
import com.ssd.gem.service.IGemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GemOrderServiceImpl implements IGemOrderService {

    @Autowired
    private GemOrderMapper gemOrderMapper;

    @Override
    public void insert(GemOrder gemOrder) {
        gemOrderMapper.insert(gemOrder);
        return;
    }
}
