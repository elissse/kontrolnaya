package org.kontrolnaya.kontrolnaya.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.kontrolnaya.kontrolnaya.repository.DbWork;
import org.flywaydb.core.Flyway;


@WebListener
public class ContextListener implements ServletContextListener {
    private static final String URL = "jdbc:postgresql://localhost:5432/kontrolnaya_db";
    private static final String USER = "elise";
    private static final String PASSWORD = "superuser";


    public void contextInitialized(ServletContextEvent sce) {
        Flyway flyway = Flyway.configure().baselineOnMigrate(true).dataSource(URL, USER, PASSWORD).load();
        flyway.migrate();
    }

    public void contextDestroyed(ServletContextEvent sce) {
        DbWork.getInstance().destroy();
    }
}
