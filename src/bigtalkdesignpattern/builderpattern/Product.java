package bigtalkdesignpattern.builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> bodys=new ArrayList<>();

    public void add(String body){
        bodys.add(body);
    }

    public void showBodys(){
        System.out.println(bodys.toString());
    }
}
