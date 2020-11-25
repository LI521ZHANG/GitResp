import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void nu(){
        System.out.println("2");
        ArrayList<String> list = new ArrayList();
        list.add("李,帅,i1,1");
       // String str = list.get(0);
       // String[] str1 = str.split(",");
        String[] str = list.get(0).split(",");
        for (String string : str){
            System.out.println(string);
        }

    }
}
