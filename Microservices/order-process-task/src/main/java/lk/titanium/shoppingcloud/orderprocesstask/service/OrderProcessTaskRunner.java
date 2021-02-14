package lk.titanium.shoppingcloud.orderprocesstask.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class OrderProcessTaskRunner implements CommandLineRunner {

    @Autowired
    OrderProcessService orderProcessService;

    @Override
    public void run(String... args) throws Exception {
        if(args.length>0) {
            System.out.println("task running with arguments");

            if (orderProcessService.validateZipCode(args[0])) {
                System.out.println("valid zip code");
            } else
                System.out.println("invalid zip code");
        }else
            System.out.println("task running without arguments");
    }
}
