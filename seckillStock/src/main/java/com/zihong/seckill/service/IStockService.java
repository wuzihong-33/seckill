package com.zihong.seckill.service;

import java.util.ArrayList;
import java.util.Map;

public interface IStockService {
  public Map<String, Object> getStockList();
  public Map<String, Object> getStock(String sku_id);
  public Map<String, Object> insertLimitPolicy(Map<String, Object> policyInfo);
}
