package com.ihrm.company.service;

import com.ihrm.common.utils.IdWorker;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hongtao Shen
 * @date 2020/4/23 - 15:20
 **/
@Service
public class CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;

    //保存企业
    public void add(Company company) {
        //基本属性设置
        company.setId(idWorker.nextId() + "");
        company.setAuditState("1"); // 0未审核  1已审核
        company.setState(1); //0未激活  1已激活
        companyDao.save(company);
    }
    //更新企业
    public void update(Company company){
        Company temp = companyDao.findById(company.getId()).get();
        temp.setName(company.getName());
        temp.setCompanyPhone(company.getCompanyPhone());
        companyDao.save(temp);
    }
    //删除企业
    public void deleteById(String id) {
        companyDao.deleteById(id);
    }
    //根据id查询企业
    public Company findById(String id) {
        return companyDao.findById(id).get();
    }
    //查询企业列表
    public List<Company> findAll(){
        return companyDao.findAll();
    }
}
