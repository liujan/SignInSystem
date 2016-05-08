package com.liujan.dao.mapper;

import com.liujan.dao.entity.Statistic;
import com.liujan.dao.entity.StatisticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatisticMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int countByExample(StatisticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int deleteByExample(StatisticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int deleteByPrimaryKey(Integer statisticId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int insert(Statistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int insertSelective(Statistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    List<Statistic> selectByExample(StatisticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    Statistic selectByPrimaryKey(Integer statisticId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int updateByExampleSelective(@Param("record") Statistic record, @Param("example") StatisticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int updateByExample(@Param("record") Statistic record, @Param("example") StatisticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int updateByPrimaryKeySelective(Statistic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statistic
     *
     * @mbggenerated Sat May 07 19:22:23 CST 2016
     */
    int updateByPrimaryKey(Statistic record);
}