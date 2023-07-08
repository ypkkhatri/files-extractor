package com.yog.filesextractor.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yougeshwar
 */
public class AppProperties {

    private Properties properties;

    public AppProperties() {
    }

    public void load() throws IOException {
        this.properties = new Properties();
        try ( InputStream in = AppConstants.class.getResourceAsStream("/application.properties")) {
            properties.load(in);
            String version = properties.getProperty("app.version");
            if (version.contains("project.version")) {
                File file = new File("pom.xml");
                String pomXML = Files.readString(Paths.get(file.toURI()));
                final String regex = "<project .+?<version>(.+?)</version>";
                final Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
                final Matcher matcher = pattern.matcher(pomXML);
                if (matcher.find()) {
                    version = matcher.group(1);
                }
            }
            AppConstants.setVersion(version);
        }
    }

    public String getUuid() {
        return properties.getProperty("app.uuid");
    }
}
