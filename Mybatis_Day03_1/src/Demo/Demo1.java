package Demo;

import domain.card;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //加载配置文件
        InputStream is = Resources.getResourceAsStream("sql.xml");
        //获取Sqlsession工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //构造session对象
        SqlSession session = factory.openSession();
        //执行sql语句
        List<card> list = session.selectList("OneToOne.findAll");
        System.out.println(list);
        //提交事务
        session.commit();
        //释放资源
        session.close();
        is.close();
    }
}
