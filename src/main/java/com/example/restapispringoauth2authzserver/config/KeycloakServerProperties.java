package com.example.restapispringoauth2authzserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";

    public String getRealmImportFile() {
        return realmImportFile;
    }

    public void setRealmImportFile(String realmImportFile) {
        this.realmImportFile = realmImportFile;
    }

    String realmImportFile = "baeldung-realm.json";

    public AdminUser getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUser adminUser) {
        this.adminUser = adminUser;
    }

    AdminUser adminUser = new AdminUser();

    // getters and setters

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public static class AdminUser {
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        String username = "admin";

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        String password = "admin";

        // getters and setters
    }
}
