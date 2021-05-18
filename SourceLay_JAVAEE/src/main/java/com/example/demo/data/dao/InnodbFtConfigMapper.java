package com.example.demo.data.dao;

import com.example.demo.data.model.InnodbFtConfig;
import com.example.demo.data.model.InnodbFtConfigExample;
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

public interface InnodbFtConfigMapper {
    @SelectProvider(type=InnodbFtConfigSqlProvider.class, method="countByExample")
    long countByExample(InnodbFtConfigExample example);

    @DeleteProvider(type=InnodbFtConfigSqlProvider.class, method="deleteByExample")
    int deleteByExample(InnodbFtConfigExample example);

    @Insert({
        "insert into INNODB_FT_CONFIG (KEY, VALUE)",
        "values (#{key,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR})"
    })
    int insert(InnodbFtConfig record);

    @InsertProvider(type=InnodbFtConfigSqlProvider.class, method="insertSelective")
    int insertSelective(InnodbFtConfig record);

    @SelectProvider(type=InnodbFtConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="KEY", property="key", jdbcType=JdbcType.VARCHAR),
        @Result(column="VALUE", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtConfig> selectByExampleWithRowbounds(InnodbFtConfigExample example, RowBounds rowBounds);

    @SelectProvider(type=InnodbFtConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="KEY", property="key", jdbcType=JdbcType.VARCHAR),
        @Result(column="VALUE", property="value", jdbcType=JdbcType.VARCHAR)
    })
    List<InnodbFtConfig> selectByExample(InnodbFtConfigExample example);

    @UpdateProvider(type=InnodbFtConfigSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);

    @UpdateProvider(type=InnodbFtConfigSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") InnodbFtConfig record, @Param("example") InnodbFtConfigExample example);
}