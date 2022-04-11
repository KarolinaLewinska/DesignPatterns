package com.java.designpatterns.proxy.authentication;

public class AuthenticationProxy extends Directory {
    private SpecificDirectory specificDirectory;
    private boolean isAuthorised;
    private String token = "fks1fjl5mdsa";

    public AuthenticationProxy(String token) {
        if (this.token.equals(token)) {
            isAuthorised = true;
            System.out.println("Proxy launched");
        }
    }

    @Override
    public String getData() {
        if (isAuthorised) {
            if (specificDirectory == null) {
                specificDirectory = new SpecificDirectory();
            }
            return "Token: " + specificDirectory.getData() + " approved";
        }
        return "Proxy: access denied";
    }
}