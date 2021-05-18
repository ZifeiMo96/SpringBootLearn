package com.example.demo.data.dao;

import com.example.demo.data.model.UserWallets;
import com.example.demo.data.model.UserWalletsExample;
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

public interface UserWalletsMapper {
    @SelectProvider(type=UserWalletsSqlProvider.class, method="countByExample")
    long countByExample(UserWalletsExample example);

    @DeleteProvider(type=UserWalletsSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserWalletsExample example);

    @Delete({
        "delete from user_wallets",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    @Insert({
        "insert into user_wallets (user_id, available_amount, ",
        "freeze_amount, wallet_status, ",
        "created_at, updated_at)",
        "values (#{userId,jdbcType=BIGINT}, #{availableAmount,jdbcType=DECIMAL}, ",
        "#{freezeAmount,jdbcType=DECIMAL}, #{walletStatus,jdbcType=TINYINT}, ",
        "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})"
    })
    int insert(UserWallets record);

    @InsertProvider(type=UserWalletsSqlProvider.class, method="insertSelective")
    int insertSelective(UserWallets record);

    @SelectProvider(type=UserWalletsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="available_amount", property="availableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="freeze_amount", property="freezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="wallet_status", property="walletStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWallets> selectByExampleWithRowbounds(UserWalletsExample example, RowBounds rowBounds);

    @SelectProvider(type=UserWalletsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="available_amount", property="availableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="freeze_amount", property="freezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="wallet_status", property="walletStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserWallets> selectByExample(UserWalletsExample example);

    @Select({
        "select",
        "user_id, available_amount, freeze_amount, wallet_status, created_at, updated_at",
        "from user_wallets",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="available_amount", property="availableAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="freeze_amount", property="freezeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="wallet_status", property="walletStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP)
    })
    UserWallets selectByPrimaryKey(Long userId);

    @UpdateProvider(type=UserWalletsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserWallets record, @Param("example") UserWalletsExample example);

    @UpdateProvider(type=UserWalletsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserWallets record, @Param("example") UserWalletsExample example);

    @UpdateProvider(type=UserWalletsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserWallets record);

    @Update({
        "update user_wallets",
        "set available_amount = #{availableAmount,jdbcType=DECIMAL},",
          "freeze_amount = #{freezeAmount,jdbcType=DECIMAL},",
          "wallet_status = #{walletStatus,jdbcType=TINYINT},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserWallets record);
}