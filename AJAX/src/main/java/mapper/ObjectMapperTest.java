package mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.User;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectMapperTest {
    private ObjectMapper mapper=new ObjectMapper();
    //对象转json，json转对象
    @Test
    public void Test01() throws Exception {
        //User对象转Jason对象
        User user = new User("张三", 23);
        String json = mapper.writeValueAsString(user);
        System.out.println("json字符串："+json);
        //json转user对象
        User user2 = mapper.readValue(json, User.class);
        System.out.println("User对象："+user2);
    }
    //Map转json，json转Map
    @Test
    public void Test02() throws Exception{
        //Map转json
        HashMap<String,String> map=new HashMap<>();
        map.put("姓名","张三");
        map.put("年龄","23");
        String json = mapper.writeValueAsString(map);
        System.out.println("json字符串:"+json);
        HashMap<String,String> map2 = mapper.readValue(json, HashMap.class);
        System.out.println("java对象："+map2);
    }
    //Map转json，json转Map
    @Test
    public void Test03() throws Exception{
        //map<String,User>转json
        User user = new User("张三", 23);
        HashMap<String,User> map=new HashMap<>();
        map.put("heima_001",user);
        String json = mapper.writeValueAsString(map);
        System.out.println("json字符串："+json);
        //json转map<String,String>
        HashMap<String,User> map2 = mapper.readValue(json, new TypeReference<HashMap<String,User>>(){});
        System.out.println("java对象：" + map2);
    }
    //List转json，json转List
    @Test
    public void Test04() throws Exception{
        //List<String>转json
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        String json = mapper.writeValueAsString(list);
        System.out.println("json字符串：" + json);
        //json转 List<String>
        ArrayList<String> list2 = mapper.readValue(json,ArrayList.class);
        System.out.println("java对象：" + list2);
    }
    //json转List<User>
    ArrayList<User> list2 = mapper.readValue(json,new TypeReference<ArrayList<User>>(){});
    System.out.println("java对象：" + list2);
}
