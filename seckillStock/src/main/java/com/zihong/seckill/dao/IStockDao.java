package com.zihong.seckill.dao;

import java.util.ArrayList;
import java.util.Map;

public interface IStockDao {
  // 返回一些列商品集合
  public ArrayList<Map<String, Object>> getStockList();
  // 返回一个商品信息
  public ArrayList<Map<String, Object>> getStock(String sku_id);
  // 增加秒杀政策
  public boolean insertLimitPolicy(Map<String, Object> policyInfo);
}
