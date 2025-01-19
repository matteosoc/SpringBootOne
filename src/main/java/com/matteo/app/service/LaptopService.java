package com.matteo.app.service;

import com.matteo.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap) {
        System.out.println("addLaptop service mnethod");
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }

}
