package com.java.designpatterns.singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ServersController {
    private static ServersController serversController;
    private final Random GENERATOR = new Random();
    private String server;
    private List<String> serversList;

    protected ServersController() {
        serversList = Arrays.asList("Server1", "Server2", "Server3", "Server4", "Server5");
    }

    public String getServer() {
        return server;
    }

    public String setServer() {
        int serverIndex = GENERATOR.nextInt(serversList.size());
        this.server = serversList.get(serverIndex);
        return server;
    }

    public static synchronized ServersController returnServerController() {
        if (serversController == null) {
            serversController = new ServersController();
        }
        return serversController;
    }
}