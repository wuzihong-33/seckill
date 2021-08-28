package com.zihong.queue;

import com.zihong.service.IStorageService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class StorageQueue {
  @Autowired
  private IStorageService iStorageService;

  @RabbitListener(queues = "storage_queue")
  public void insertStorage(String msg){
    //1、接收消息并输出
    System.out.println("storage_queue接收消息："+msg);

    //2、调用库存写入方法
    Map<String, Object> resultMap ;
    resultMap = iStorageService.insertStorage(msg, 0, 1);

    //3、如果写入失败，输出失败信息
    if (!(Boolean) resultMap.get("result")){
      System.out.println("storage_queue处理消息失败："+resultMap.get("msg").toString());
    }else {
      //4、输出成功信息
      System.out.println("storage_queue处理消息成功！");
    }
  }
}
