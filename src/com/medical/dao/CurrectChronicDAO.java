package com.medical.dao;

import com.medical.model.CurrectChronic;
import com.medical.model.CurrectChronicExample;
import java.util.List;

public interface CurrectChronicDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	int countByExample(CurrectChronicExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	int deleteByExample(CurrectChronicExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	void insert(CurrectChronic record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	void insertSelective(CurrectChronic record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	List<CurrectChronic> selectByExample(CurrectChronicExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	int updateByExampleSelective(CurrectChronic record,
			CurrectChronicExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table YLJZN.CURRECT_CHRONIC
	 * @ibatorgenerated  Fri Oct 31 11:26:08 CST 2014
	 */
	int updateByExample(CurrectChronic record, CurrectChronicExample example);
}