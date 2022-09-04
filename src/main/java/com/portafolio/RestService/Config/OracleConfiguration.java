package com.portafolio.RestService.Config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


import javax.sql.DataSource;
import java.sql.SQLException;
///*
//    This class grabs the appropriate values for OracleDataSource,
//    The method that uses env, grabs it from the environment variables set
//    in the docker container. The method that uses dbSettings is for local testing
//    @author: peter.song@oracle.com
// */
//
//
@Configuration
public class OracleConfiguration {
    @Autowired
    private Environment env;
    @Autowired
    private DbSettings dbSettings;
    @Bean
    public DataSource dataSource() throws SQLException{
        OracleDataSource ds = new OracleDataSource();
//        For local testing
        ds.setDriverType(dbSettings.getDriver_class_name());
        System.out.println("Using Driver " + dbSettings.getDriver_class_name());
        ds.setURL(dbSettings.getUrl());
        System.out.println("Using URL: " + dbSettings.getUrl());
        ds.setUser(dbSettings.getUsername());
        System.out.println("Using Username: " + dbSettings.getUsername());
        ds.setPassword(dbSettings.getPassword());
        return ds;
    }
}