package com.feifei.core;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@Configurable
public class DaraSourceConfiguration extends UnpooledDataSourceFactory {

//    @Value("${spring.datasource.driver-class-name}")
//    private String driver;
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String username;
//    @Value("${spring.datasource.password}")
//    private String password;

    @Bean
    public ServletRegistrationBean<StatViewServlet> druidServlet() {
        ServletRegistrationBean<StatViewServlet> reg = new ServletRegistrationBean<StatViewServlet>();
        reg.setServlet(new StatViewServlet());
        reg.addUrlMappings("/druid/*");
        //设置控制台管理用户
        reg.addInitParameter("loginUsername","root");
        reg.addInitParameter("loginPassword","123456");
        // 禁用HTML页面上的“Reset All”功能
        reg.addInitParameter("resetEnable","false");
        //reg.addInitParameter("allow", "127.0.0.1"); //白名单
        return reg;
    }

//        @Bean
//        public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
//            //创建过滤器
//            FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>();
//            filterRegistrationBean.setFilter(new WebStatFilter());
//            Map<String, String> initParams = new HashMap<String, String>();
//            //忽略过滤的形式
//            initParams.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
//            filterRegistrationBean.setInitParameters(initParams);
//            //设置过滤器过滤路径
//            filterRegistrationBean.addUrlPatterns("/*");
//            return filterRegistrationBean;
//        }
}
