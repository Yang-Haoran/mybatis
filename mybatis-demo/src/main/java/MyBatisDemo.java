import mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Brand;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    //查找全部
    public static void main(String[] args) throws IOException {
//        加载mybatis的核心配置文件，获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSessionFactory对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.执行sql语句
        //List<Object> Brands = sqlSession.selectList("test.selectAll");
        //上下两种方法都可以
        //3.1获取Brand接口的代理对象
        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> Brands = brandmapper.selectAll();


        System.out.println(Brands);

        //4.释放资源
        sqlSession.close();
    }

}
