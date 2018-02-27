package com.zheng.test.dao.api;

import com.zheng.common.db.Assist;
import com.zheng.test.dao.model.TbVehicleType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃  神兽保佑
 * 　　　　┃　　　┃  代码无bug
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 *
 * @Author Mr.Li
 * @Date 2018/1/23 16:09
 * @Description: TODO TbVehicleTypeService 降级实现
 *  
 */

public class TbVehicleTypeServiceMock implements TbVehicleTypeService {

    private static final Logger logger = LoggerFactory.getLogger(TbVehicleTypeServiceMock.class);
    @Override
    public long getTbVehicleTypeRowCount(Assist assist) {
        logger.info("TbVehicleTypeServiceMock => getTbVehicleTypeRowCount");
        return 0;
    }

    @Override
    public List<TbVehicleType> selectTbVehicleType(Assist assist) {
        logger.info("TbVehicleTypeServiceMock => selectTbVehicleType");
        return null;
    }

    @Override
    public TbVehicleType selectTbVehicleTypeByObj(TbVehicleType obj) {
        logger.info("TbVehicleTypeServiceMock => selectTbVehicleTypeByObj");
        return null;
    }

    @Override
    public TbVehicleType selectTbVehicleTypeById(Long id) throws Exception {
        logger.info("TbVehicleTypeServiceMock => selectTbVehicleTypeById");
        return null;
    }

    @Override
    public int insertTbVehicleType(TbVehicleType value) {
        logger.info("TbVehicleTypeServiceMock => insertTbVehicleType");
        return 0;
    }

    @Override
    public int insertNonEmptyTbVehicleType(TbVehicleType value) {
        logger.info("TbVehicleTypeServiceMock => insertNonEmptyTbVehicleType");
        return 0;
    }

    @Override
    public int deleteTbVehicleTypeById(Long id) {
        logger.info("TbVehicleTypeServiceMock => deleteTbVehicleTypeById");
        return 0;
    }

    @Override
    public int deleteTbVehicleType(Assist assist) {
        logger.info("TbVehicleTypeServiceMock => deleteTbVehicleType");
        return 0;
    }

    @Override
    public int updateTbVehicleTypeById(TbVehicleType enti) {
        logger.info("TbVehicleTypeServiceMock => updateTbVehicleTypeById");
        return 0;
    }

    @Override
    public int updateTbVehicleType(TbVehicleType value, Assist assist) {
        logger.info("TbVehicleTypeServiceMock => updateTbVehicleType");
        return 0;
    }

    @Override
    public int updateNonEmptyTbVehicleTypeById(TbVehicleType enti) {
        logger.info("TbVehicleTypeServiceMock => updateNonEmptyTbVehicleTypeById");
        return 0;
    }

    @Override
    public int updateNonEmptyTbVehicleType(TbVehicleType value, Assist assist) {
        logger.info("TbVehicleTypeServiceMock => updateNonEmptyTbVehicleType");
        return 0;
    }

    @Override
    public Long getTbVehicleTypeCount(String id, String engineCode, String remark) {
        logger.info("TbVehicleTypeServiceMock => getTbVehicleTypeCount");
        return null;
    }

    @Override
    public List getTbVehicleType(String id, String engineCode, String remark, Integer pageindex, Integer pageSize) throws Exception {
        logger.info("TbVehicleTypeServiceMock => getTbVehicleType");
        return null;
    }

    @Override
    public int deleteById(Long id) throws Exception {
        logger.info("TbVehicleTypeServiceMock => deleteById");
        return 0;
    }

    @Override
    public void saveOrUpdate(TbVehicleType vehicleType) throws Exception {
      logger.info("TbVehicleTypeServiceMock => saveOrUpdate");
    }

    @Override
    public List<Object> getListByCompany(String companyId) {
        logger.info("TbVehicleTypeServiceMock => getListByCompany");
        return null;
    }
}
