package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbTablespacesEncryption;
import com.example.demo.data.model.InnodbTablespacesEncryptionExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface InnodbTablespacesEncryptionMapper {
    @SelectProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="countByExample")
    long countByExample(InnodbTablespacesEncryptionExample example);

    @DeleteProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbTablespacesEncryptionExample example);

    @Insert({
        "insert into INNODB_TABLESPACES_ENCRYPTION (SPACE, NAME, ",
        "ENCRYPTION_SCHEME, KEYSERVER_REQUESTS, ",
        "MIN_KEY_VERSION, CURRENT_KEY_VERSION, ",
        "KEY_ROTATION_PAGE_NUMBER, KEY_ROTATION_MAX_PAGE_NUMBER, ",
        "CURRENT_KEY_ID, ROTATING_OR_FLUSHING)",
        "values (#{space,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{encryptionScheme,jdbcType=INTEGER}, #{keyserverRequests,jdbcType=INTEGER}, ",
        "#{minKeyVersion,jdbcType=INTEGER}, #{currentKeyVersion,jdbcType=INTEGER}, ",
        "#{keyRotationPageNumber,jdbcType=BIGINT}, #{keyRotationMaxPageNumber,jdbcType=BIGINT}, ",
        "#{currentKeyId,jdbcType=INTEGER}, #{rotatingOrFlushing,jdbcType=INTEGER})"
    })
    int insert(InnodbTablespacesEncryption record);

    @InsertProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbTablespacesEncryption record);

    @SelectProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENCRYPTION_SCHEME", property="encryptionScheme", jdbcType=JdbcType.INTEGER),
        @Result(column="KEYSERVER_REQUESTS", property="keyserverRequests", jdbcType=JdbcType.INTEGER),
        @Result(column="MIN_KEY_VERSION", property="minKeyVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="CURRENT_KEY_VERSION", property="currentKeyVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="KEY_ROTATION_PAGE_NUMBER", property="keyRotationPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="KEY_ROTATION_MAX_PAGE_NUMBER", property="keyRotationMaxPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_KEY_ID", property="currentKeyId", jdbcType=JdbcType.INTEGER),
        @Result(column="ROTATING_OR_FLUSHING", property="rotatingOrFlushing", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTablespacesEncryption> selectByExampleWithRowbounds(InnodbTablespacesEncryptionExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="SPACE", property="space", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENCRYPTION_SCHEME", property="encryptionScheme", jdbcType=JdbcType.INTEGER),
        @Result(column="KEYSERVER_REQUESTS", property="keyserverRequests", jdbcType=JdbcType.INTEGER),
        @Result(column="MIN_KEY_VERSION", property="minKeyVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="CURRENT_KEY_VERSION", property="currentKeyVersion", jdbcType=JdbcType.INTEGER),
        @Result(column="KEY_ROTATION_PAGE_NUMBER", property="keyRotationPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="KEY_ROTATION_MAX_PAGE_NUMBER", property="keyRotationMaxPageNumber", jdbcType=JdbcType.BIGINT),
        @Result(column="CURRENT_KEY_ID", property="currentKeyId", jdbcType=JdbcType.INTEGER),
        @Result(column="ROTATING_OR_FLUSHING", property="rotatingOrFlushing", jdbcType=JdbcType.INTEGER)
    })
    List<InnodbTablespacesEncryption> selectByExample(InnodbTablespacesEncryptionExample example);

    @UpdateProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbTablespacesEncryption record, @Param("example") InnodbTablespacesEncryptionExample example);

    @UpdateProvider(type=InnodbTablespacesEncryptionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbTablespacesEncryption record, @Param("example") InnodbTablespacesEncryptionExample example);
}