package com.ssd.gem.mbg.mapper;

import com.ssd.gem.mbg.model.GemOrder;
import com.ssd.gem.mbg.model.GemOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GemOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int countByExample(GemOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int deleteByExample(GemOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int insert(GemOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int insertSelective(GemOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    List<GemOrder> selectByExample(GemOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    GemOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") GemOrder record, @Param("example") GemOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int updateByExample(@Param("record") GemOrder record, @Param("example") GemOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int updateByPrimaryKeySelective(GemOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gem_order
     *
     * @mbggenerated Wed Mar 18 20:49:33 CST 2020
     */
    int updateByPrimaryKey(GemOrder record);
}