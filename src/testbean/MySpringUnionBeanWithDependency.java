package testbean;

import org.springframework.beans.factory.annotation.Autowired;
import union.Union;

public class MySpringUnionBeanWithDependency {

    private Union union;

    @Autowired

    public void setUnion (Union pUnion){

        this.union = pUnion;

    }

    public void run(){

        int x =10;
        int y =20;

        System.out.println(union.union(x,y));


    }
}
