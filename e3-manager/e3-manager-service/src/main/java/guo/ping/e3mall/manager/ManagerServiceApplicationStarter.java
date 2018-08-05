package guo.ping.e3mall.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "guo.ping.e3mall.manager.mapper")
@SpringBootApplication
public class ManagerServiceApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ManagerServiceApplicationStarter.class, args);
    }
}