package lk.titanium.shoppingcloud.orderprocesstask;

import lk.titanium.shoppingcloud.orderprocesstask.service.OrderProcessTaskRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class OrderProcessTaskApplication {

	@Bean
	OrderProcessTaskRunner getRentProcessTaskRunner() {
		return new OrderProcessTaskRunner();
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessTaskApplication.class, args);
	}

}
