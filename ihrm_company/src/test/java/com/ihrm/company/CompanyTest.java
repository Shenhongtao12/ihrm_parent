package com.ihrm.company;

import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Hongtao Shen
 * @date 2020/4/23 - 15:09
 **/
@SpringBootTest
public class CompanyTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test(){
        Company company = companyDao.findById("1").get();
        System.out.println(company);
    }
}
