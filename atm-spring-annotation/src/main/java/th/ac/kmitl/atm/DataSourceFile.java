package th.ac.kmitl.atm;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@Component
public class DataSourceFile implements DataSource {

    public Map<Integer,Customer> readCustomers() {

        Map<Integer,Customer> customers = new HashMap<>();
        Scanner in;

        customers.put(1,new Customer(1,"Kwan",1234,1000));
        customers.put(2,new Customer(2,"Ploy",2345,2000));
        customers.put(3,new Customer(3,"Fon",3456,3000));

        return customers;
    }
}