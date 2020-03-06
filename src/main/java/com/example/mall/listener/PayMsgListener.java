package com.example.mall.listener;

import com.example.mall.pojo.PayInfo;
import com.example.mall.service.IOrderService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "payNotify")
@Slf4j
public class PayMsgListener  {

    @Autowired
    private IOrderService orderService;

    @RabbitHandler
    public void process(String msg){
      log.info("【接收到消息】=> {}",msg);

        PayInfo payInfo = new Gson().fromJson(msg, PayInfo.class);
        if (payInfo.getPlatformStatus().equals("SUCCESS")) {
            orderService.paid(payInfo.getOrderNo());
        }
    }
}
