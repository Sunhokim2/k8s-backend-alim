package com.welab.k8sbackendalim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 요청할때만 넣는다. 0611 기준 알림에서 요청을 다른 서비스로 보내는건 없으니 필요없는데 그냥 넣어놈 ㅎ
@EnableFeignClients
@SpringBootApplication
public class K8sBackendAlimApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sBackendAlimApplication.class, args);
    }

}
