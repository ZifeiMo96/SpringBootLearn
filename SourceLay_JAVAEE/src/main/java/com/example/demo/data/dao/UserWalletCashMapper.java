package com.example.demo.data.dao;

import com.example.demo.data.model.UserWalletCash;
import com.example.demo.data.model.UserWalletCashExample;
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

public interface UserWalletCashMapper {
    @SelectProvider(type=UserWalletCashSqlProvider.class, method="countByExample")
    long countByExample(UserWalletCashExample example);

    @DeleteProvider(type=UserWalletCashSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserWalletCashExample example);

    @Delete({
        "delete from user_wallet_cash",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_wallet_cash (id, user_id, ",
        "cash_sn, cash_charge, ",
        "cash_actual_amount, cash_apply_amount, ",
        "cash_status, cash_mobile, ",
        "cash_type, remark, ",
        "trade_time, trade_no, ",
        "error_code, error_message, ",
        "refunds_status, created_at, ",
        "updated_at)",
        "values (#{id,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
        "#{cashSn,jdbcType=BIGINT}, #{cashCharge,jdbcType=DECIMAL}, ",
        "#{cashActualAmount,jdbcType=DECIMAL}, #{cashApplyAmount,jdbcType=DECIMAL}, ",
        "#{cashStatus,jdbcType=TINYINT}, #{cashMobile,jdbcType=VARCHAR}, ",
        "#{cashType,jdbcType=TINYINT}, #{remark,jdbcType=VARCHAR}, ",
        "#{tradeTime,jdbcType=TIMESTAMP}, #{tradeNo,jdbcType=VARCHAR}, ",
        "#{errorCode,jdbcType=VARCHAR}, #{errorMessage,jdbcType=VARCHAR}, ",
        "#{refundsStatus,jdbcType=TINYINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
        "#{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserWalletCash record);

    @InsertProvider(type=UserWalletCashSqlProvider.class, method="insertSelective")
    int insertSelective(UserWalletCash record);

    @SelectProvider(type=UserWalletCashSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_sn", property="cashSn", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_charge", property="cashCharge", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_actual_amount", property="cashActualAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_apply_amount", property="cashApplyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_status", property="cashStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="cash_mobile", property="cashMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="cash_type", property="cashType", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_time", property="tradeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_code", property="errorCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_message", property="errorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="refunds_status", property="refundsStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletCash> selectByExampleWithRowbounds(UserWalletCashExample example, RowBounds rowBounds);

    @SelectProvider(type=UserWalletCashSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_sn", property="cashSn", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_charge", property="cashCharge", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_actual_amount", property="cashActualAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_apply_amount", property="cashApplyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_status", property="cashStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="cash_mobile", property="cashMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="cash_type", property="cashType", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_time", property="tradeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_code", property="errorCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_message", property="errorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="refunds_status", property="refundsStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWalletCash> selectByExample(UserWalletCashExample example);

    @Select({
        "select",
        "id, user_id, cash_sn, cash_charge, cash_actual_amount, cash_apply_amount, cash_status, ",
        "cash_mobile, cash_type, remark, trade_time, trade_no, error_code, error_message, ",
        "refunds_status, created_at, updated_at",
        "from user_wallet_cash",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_sn", property="cashSn", jdbcType=JdbcType.BIGINT),
        @Result(column="cash_charge", property="cashCharge", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_actual_amount", property="cashActualAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_apply_amount", property="cashApplyAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="cash_status", property="cashStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="cash_mobile", property="cashMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="cash_type", property="cashType", jdbcType=JdbcType.TINYINT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="trade_time", property="tradeTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="trade_no", property="tradeNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_code", property="errorCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="error_message", property="errorMessage", jdbcType=JdbcType.VARCHAR),
        @Result(column="refunds_status", property="refundsStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserWalletCash selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserWalletCashSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserWalletCash record, @Param("example") UserWalletCashExample example);

    @UpdateProvider(type=UserWalletCashSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserWalletCash record, @Param("example") UserWalletCashExample example);

    @UpdateProvider(type=UserWalletCashSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserWalletCash record);

    @Update({
        "update user_wallet_cash",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "cash_sn = #{cashSn,jdbcType=BIGINT},",
          "cash_charge = #{cashCharge,jdbcType=DECIMAL},",
          "cash_actual_amount = #{cashActualAmount,jdbcType=DECIMAL},",
          "cash_apply_amount = #{cashApplyAmount,jdbcType=DECIMAL},",
          "cash_status = #{cashStatus,jdbcType=TINYINT},",
          "cash_mobile = #{cashMobile,jdbcType=VARCHAR},",
          "cash_type = #{cashType,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "trade_time = #{tradeTime,jdbcType=TIMESTAMP},",
          "trade_no = #{tradeNo,jdbcType=VARCHAR},",
          "error_code = #{errorCode,jdbcType=VARCHAR},",
          "error_message = #{errorMessage,jdbcType=VARCHAR},",
          "refunds_status = #{refundsStatus,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserWalletCash record);
}