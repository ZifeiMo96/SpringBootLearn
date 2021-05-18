package com.example.demo.data.dao;

import com.example.demo.data.model.Finance;
import com.example.demo.data.model.FinanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface FinanceMapper {
    @SelectProvider(type=FinanceSqlProvider.class, method="countByExample")
    long countByExample(FinanceExample example);

    @DeleteProvider(type=FinanceSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinanceExample example);

    @Delete({
        "delete from finance",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into finance (id, income, ",
        "withdrawal, order_count, ",
        "order_amount, total_profit, ",
        "register_profit, master_portion, ",
        "withdrawal_profit, created_at)",
        "values (#{id,jdbcType=BIGINT}, #{income,jdbcType=DECIMAL}, ",
        "#{withdrawal,jdbcType=DECIMAL}, #{orderCount,jdbcType=INTEGER}, ",
        "#{orderAmount,jdbcType=DECIMAL}, #{totalProfit,jdbcType=DECIMAL}, ",
        "#{registerProfit,jdbcType=DECIMAL}, #{masterPortion,jdbcType=DECIMAL}, ",
        "#{withdrawalProfit,jdbcType=DECIMAL}, #{createdAt,jdbcType=DATE})"
    })
    int insert(Finance record);

    @InsertProvider(type=FinanceSqlProvider.class, method="insertSelective")
    int insertSelective(Finance record);

    @SelectProvider(type=FinanceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal", property="withdrawal", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_amount", property="orderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_profit", property="totalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="register_profit", property="registerProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_portion", property="masterPortion", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal_profit", property="withdrawalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.DATE)
    })
    List<Finance> selectByExampleWithRowbounds(FinanceExample example, RowBounds rowBounds);

    @SelectProvider(type=FinanceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal", property="withdrawal", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_amount", property="orderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_profit", property="totalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="register_profit", property="registerProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_portion", property="masterPortion", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal_profit", property="withdrawalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.DATE)
    })
    List<Finance> selectByExample(FinanceExample example);

    @Select({
        "select",
        "id, income, withdrawal, order_count, order_amount, total_profit, register_profit, ",
        "master_portion, withdrawal_profit, created_at",
        "from finance",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal", property="withdrawal", jdbcType=JdbcType.DECIMAL),
        @Result(column="order_count", property="orderCount", jdbcType=JdbcType.INTEGER),
        @Result(column="order_amount", property="orderAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="total_profit", property="totalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="register_profit", property="registerProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="master_portion", property="masterPortion", jdbcType=JdbcType.DECIMAL),
        @Result(column="withdrawal_profit", property="withdrawalProfit", jdbcType=JdbcType.DECIMAL),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.DATE)
    })
    Finance selectByPrimaryKey(Long id);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    @UpdateProvider(type=FinanceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Finance record);

    @Update({
        "update finance",
        "set income = #{income,jdbcType=DECIMAL},",
          "withdrawal = #{withdrawal,jdbcType=DECIMAL},",
          "order_count = #{orderCount,jdbcType=INTEGER},",
          "order_amount = #{orderAmount,jdbcType=DECIMAL},",
          "total_profit = #{totalProfit,jdbcType=DECIMAL},",
          "register_profit = #{registerProfit,jdbcType=DECIMAL},",
          "master_portion = #{masterPortion,jdbcType=DECIMAL},",
          "withdrawal_profit = #{withdrawalProfit,jdbcType=DECIMAL},",
          "created_at = #{createdAt,jdbcType=DATE}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Finance record);
}