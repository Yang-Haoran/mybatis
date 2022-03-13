package Test;

import mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Brand;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    //查找全部
//    public static void main(String[] args) throws IOException {
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //3.执行sql语句
//        //List<Object> Brands = sqlSession.selectList("test.selectAll");
//        //上下两种方法都可以
//        //3.1获取Brand接口的代理对象
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> Brands = brandmapper.selectAll();
//
//
//        System.out.println(Brands);
//
//        //4.释放资源
//        sqlSession.close();
//    }

//    select by id
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int id = 1;
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //3.执行sql语句
//        //List<Object> Brands = sqlSession.selectList("test.selectAll");
//        //上下两种方法都可以
//        //3.1获取Brand接口的代理对象
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        Brand brand = brandmapper.selectById(id);
//        System.out.println(brand);
//
//        //4.释放资源
//        sqlSession.close();
//    }

//    //select by condition
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int status = 1;
//        String company_name = "华为";
//        String brand_name = "华为";
//
//        //处理参数
//        company_name = "%" + company_name + "%";
//        brand_name = "%" + brand_name + "%";
//
////        //封装对象（对于第二种条件查询）
////        Brand brand = new Brand();
////        brand.setStatus(status);
////        brand.setCompany_name(company_name);
////        brand.setBrand_name(Brand_name);
//
//        //封装对象（对于第三种）
//        Map map = new HashMap();
//        map.put("status",status);
//        map.put("company_name",company_name);
//        map.put("brand_name",brand_name);
//
//
//
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //3.执行sql语句
//        //List<Object> Brands = sqlSession.selectList("test.selectAll");
//        //上下两种方法都可以
//        //3.1获取Brand接口的代理对象
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        //第一种方法
////        List<Brand> brands = brandmapper.selectByCondition(status, companyName, BrandName);
//
//        //第二种
////        List<Brand> brands = brandmapper.selectByCondition(brand);
////        System.out.println(brands);
//
//        //第三种
//        List<Brand> brands = brandmapper.selectByCondition(map);
//        System.out.println(brands);
//
//        //4.释放资源
//        sqlSession.close();
//    }


//    select by conditionSingle
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int status = 1;
//        String company_name = "华为";
//        String brand_name = "华为";
//
//        //处理参数
//        company_name = "%" + company_name + "%";
//        brand_name = "%" + brand_name + "%";
//
//        //封装对象（对于第二种条件查询）
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        //brand.setCompany_name(company_name);
//        //brand.setBrand_name(brand_name);
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //3.执行sql语句
//        //List<Object> Brands = sqlSession.selectList("test.selectAll");
//        //上下两种方法都可以
//        //3.1获取Brand接口的代理对象
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        //第一种方法
////        List<Brand> brands = brandmapper.selectByCondition(status, companyName, BrandName);
//
//        //第二种
////        List<Brand> brands = brandmapper.selectByCondition(brand);
////        System.out.println(brands);
//
//        //第三种
//        List<Brand> brands = brandmapper.selectByConditionSingle(brand);
//        System.out.println(brands);
//
//        //4.释放资源
//        sqlSession.close();
//    }

    //test add
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int status = 1;
//        String company_name = "大米手机";
//        String brand_name = "大米";
//        String description ="手机中的战斗机";
//        int ordered = 100;
//
//        //封装对象（对于第二种条件查询）
//        Brand brand = new Brand();
//        brand.setStatus(status);
//        brand.setCompany_name(company_name);
//        brand.setBrand_name(brand_name);
//        brand.setOrdered(ordered);
//        brand.setDescription(description);
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        brandmapper.add(brand);
//        int id = brand.getId();
//        System.out.println(id);
//
//        //需要提交事务 或者sqlSession里设置位true
//        //sqlSession.commit();
//
//        //4.释放资源
//        sqlSession.close();
//    }

    //update
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int status = 1;
//        String company_name = "大米手机";
//        String brand_name = "大米";
//        String description = "哈哈哈哈，鸡汤来咯";
//        int ordered = 100;
//        int id = 3;
//
//        //封装对象（对于第二种条件查询）
//        Brand brand = new Brand();
//        brand.setStatus(status);
////        brand.setCompany_name(company_name);
////        brand.setBrand_name(brand_name);
////        brand.setOrdered(ordered);
//        brand.setDescription(description);
//        brand.setId(id);
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        int count = brandmapper.update(brand);
//        System.out.println(count);
//
//        //需要提交事务 或者sqlSession里设置位true
//        //sqlSession.commit();
//
//        //4.释放资源
//        sqlSession.close();
//    }

    //delete by id 删除一行
//    public static void main(String[] args) throws IOException {
//
//        //接收参数
//        int id = 3;
//
//
////        加载mybatis的核心配置文件，获取SqlSessionFactory对象
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //2.获取SqlSessionFactory对象，用它来执行sql
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//
//
//        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);
//
//        brandmapper.deleteById(id);
//
//
//        //需要提交事务 或者sqlSession里设置位true
//        //sqlSession.commit();
//
//        //4.释放资源
//        sqlSession.close();
//    }

    //delete by ids 删除多行
    public static void main(String[] args) throws IOException {

        //接收参数
        int [] ids = {1,7,8};


//        加载mybatis的核心配置文件，获取SqlSessionFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.获取SqlSessionFactory对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession(true);


        BrandMapper brandmapper = sqlSession.getMapper(BrandMapper.class);

        brandmapper.deleteByIds(ids);


        //需要提交事务 或者sqlSession里设置位true
        //sqlSession.commit();

        //4.释放资源
        sqlSession.close();
    }
}
