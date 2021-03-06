package com.medical.dao;

import com.medical.model.DmBizdept;
import com.medical.model.DmBizdeptExample;
import java.util.List;

public interface DmBizdeptDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int countByExample(DmBizdeptExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int deleteByExample(DmBizdeptExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int deleteByPrimaryKey(String hospitalId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    void insert(DmBizdept record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    void insertSelective(DmBizdept record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    List<DmBizdept> selectByExample(DmBizdeptExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    DmBizdept selectByPrimaryKey(String hospitalId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int updateByExampleSelective(DmBizdept record, DmBizdeptExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int updateByExample(DmBizdept record, DmBizdeptExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int updateByPrimaryKeySelective(DmBizdept record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table YLJZN.DM_BIZDEPT
     *
     * @ibatorgenerated Wed Aug 19 10:40:02 CST 2009
     */
    int updateByPrimaryKey(DmBizdept record);
}