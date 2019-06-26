package com.kfr.youkuang.mapper;

import com.kfr.youkuang.entity.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Mapper
@Component
public interface AccountMapper {

    @Insert("INSERT INTO account(accountName,userID,sum,budget,lastModifiedTime,createdTime) " +
            "values(#{accountName}, #{userID}, #{sum}, #{budget},#{lastModifiedTime}, #{createdTime})")
    void insertOneAccount(@Param("accountName") String accountName,
                          @Param("userID") final int userID,
                          @Param("sum") BigDecimal sum,
                          @Param("budget") BigDecimal budget,
                          @Param("lastModifiedTime") Timestamp lastModifiedTime,
                          @Param("createdTime") Timestamp createdTime);

    @Select("SELECT * FROM account WHERE accountName = #{accountName} AND userID = #{userID}")
    Account selectAccountByAccountName(@Param("accountName") final String accountName,
                                       @Param("userID") final int userID);

    @Select("SELECT * FROM account WHERE accountID = #{accountID}")
    Account selectAccountByAccountID(@Param("accountID") final int accountID);

    @Select("SELECT * FROM account WHERE UserID = #{UserID}")
    List<Account> getaccountsIDbyUserID(@Param("UserID") final int UserID);


    //存疑 动态建表？
    void createNewAccountTable(@Param("tableName") String tableName);



    //TODO:修改账本（预算、账本名pass）String accountName, BigDecimal sum, BigDecimal budget

    @Update("UPDATE account SET budget=#{budget} WHERE accountID = #{accountID} AND userID = #{userID}")
    void modifyBudget(@Param("budget") final BigDecimal budget,
                      @Param("accountID") final int accountID,
                      @Param("userID") final int userID);

    //删account的表里面一行的记录
    @Delete("DELETE FROM account WHERE accountID =  #{accountID} AND UserID =  #{UserID}")
    boolean deleteAccount(@Param("accountID") int accountID, @Param("UserID") int UserID);

    //删表
    boolean dropAccountTable(@Param("tableName") String tableName);
}
