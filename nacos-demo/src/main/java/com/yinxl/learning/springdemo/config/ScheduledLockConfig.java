// package com.yinxl.learning.springdemo.config;
//
// import jakarta.annotation.Resource;
// import net.javacrumbs.shedlock.core.LockProvider;
// import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.core.JdbcTemplate;
//
// import javax.sql.DataSource;
// import java.util.TimeZone;
//
// // @Configuration
// public class ScheduledLockConfig {
//     @Resource
//     private DataSource dataSource;
//
//     @Bean
//     public LockProvider lockProvider() {
//         return new JdbcTemplateLockProvider(JdbcTemplateLockProvider.Configuration.builder()
//                 .withJdbcTemplate(new JdbcTemplate(dataSource)).withTimeZone(TimeZone.getTimeZone("UTC")).build());
//     }
// }
