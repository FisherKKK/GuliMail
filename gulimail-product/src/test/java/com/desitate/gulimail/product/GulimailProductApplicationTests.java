package com.desitate.gulimail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.desitate.gulimail.product.entity.BrandEntity;
import com.desitate.gulimail.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@Slf4j
@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(13L);
//        brandEntity.setDescript("Apple手机");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntityp);
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "Apple"));
        list.forEach(System.out::println);
//        log.info("保存成功");


    }

}
