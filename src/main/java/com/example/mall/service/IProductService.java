package com.example.mall.service;

import com.example.mall.vo.ProductDetailVo;
import com.example.mall.vo.ProductVo;
import com.example.mall.vo.ResponseVo;
import com.github.pagehelper.PageInfo;


public interface IProductService {

    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    ResponseVo<ProductDetailVo> detail(Integer productId);
}
