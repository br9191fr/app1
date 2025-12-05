package com.cecurity.app1.core.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties( "app1" )
public class App1Properties {

    public static class Filesystem {
        /**
         * Required minimum free disk space for local file system.
         */
        private long minimumFreeDiskSpace = 1_000_000;
        public long getMinimumFreeDiskSpace() {
            return minimumFreeDiskSpace;
        }
        public void setMinimumFreeDiskSpace( long minimumFreeDiskSpace ) {
            this.minimumFreeDiskSpace = minimumFreeDiskSpace;
        }
    }

    private Filesystem filesystem = new Filesystem();
    public Filesystem getFilesystem() {
        return filesystem;
    }
    public void setFilesystem( Filesystem filesystem ) {
        this.filesystem = filesystem;
    }
}