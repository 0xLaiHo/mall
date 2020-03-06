package com.example.mall.service;

import com.example.mall.form.ShippingForm;
import com.example.mall.vo.ResponseVo;
import com.github.pagehelper.PageInfo;
import java.util.Map;

public interface IShippingService {

    ResponseVo<Map<String,Integer>> add(Integer uid, ShippingForm form);

    ResponseVo delete(Integer uid, Integer shippingId);

    ResponseVo update(Integer uid, Integer shippingId,ShippingForm form);

    ResponseVo<PageInfo> list(Integer uid,Integer pageNum,Integer pageSize);
}
