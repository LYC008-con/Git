package com.cy.pj.dao.zsm;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.vo.zsm.collectVo;
import com.cy.pj.vo.zsm.house_count;
import com.cy.pj.vo.zsm.house_de;
import com.cy.pj.vo.zsm.house_erji;
import com.cy.pj.vo.zsm.house_xq;
import com.cy.pj.vo.zsm.povo;
import com.cy.pj.vo.zsm.tb_collect;

@Mapper
public interface HouseCountMapper {

	/**
	 * 查询各地房屋数量
	 * @return
	 */
	List<house_count>queryHouseCount();

	
	/**
	 * 首页列出房子列表1（未做业务排序）
	 */
	List<house_de>queryhouse();
	/**
	 * 首页列表二（未做业务排序）
	 * @return
	 */
	List<house_de>queryhouse1();
	
	
	List<povo>queryposition();
	
	
	List<house_erji>houseerji(@Param("position") String position,@Param("housetype")String housetype,@Param("baseprice1") Integer price1,@Param("baseprice2") Integer price2,@Param("weizhi") String weizhi,@Param("xu")Integer xu);

	
	house_xq queryhousexq(@Param("houseid") String houseid);

	
	
	tb_collect querycollect(@Param("houseid") String houseid);
	
	
	int insertCollect(@Param("collect") tb_collect collect);
	
	List<collectVo>querycollecthousexq(@Param("userid") Integer userid);

	int deletecollect(@Param("collectId") Integer collectId);
}
