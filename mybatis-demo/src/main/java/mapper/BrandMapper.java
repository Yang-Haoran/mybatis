package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Brand;

import java.util.List;
import java.util.Map;


public interface BrandMapper {

    List<Brand> selectAll();

    Brand selectById(int id);

/*    条件查询
        参数接受
            1.散装参数：如果方法中有多个参数，需要使用 @Param("sql参数占位符名称")
            2.对象参数：对象的属性名称要和参数占位符名称一致



 */


//    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName,@Param("brandName") String brandName);


//    List<Brand> selectByCondition(Brand brand);

//    List<Brand> selectByCondition(Map map);


    //但条件动态查询
    List<Brand> selectByConditionSingle(Brand brand);


    /*
    * 添加
     */
    void add(Brand brand);


    /*
    * 修改
     */
    int update(Brand brand);

    /*
    * 根据id删除
     */
    int deleteById(int id);

    /*
    * 批量删除
     */
    void deleteByIds(@Param("ids") int[] ids);

}
