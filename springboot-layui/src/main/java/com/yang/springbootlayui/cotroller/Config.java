package com.yang.springbootlayui.cotroller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/first").setViewName("/first");
        registry.addViewController("/innerModel").setViewName("/innerModel");
        registry.addViewController("/page1").setViewName("/passPage/分页/page1");
        registry.addViewController("/layim").setViewName("/passPage/即时通讯/layim");
        registry.addViewController("/laytpl").setViewName("/passPage/模板引擎/laytpl");
        registry.addViewController("/laytpl2").setViewName("/passPage/模板引擎/laytpl2");
        registry.addViewController("/table").setViewName("passPage/tables/table");
        registry.addViewController("/admin/index/index").setViewName("/template/admin/index/index");
        registry.addViewController("/navLeft").setViewName("/template/navLeft");

    }
}
