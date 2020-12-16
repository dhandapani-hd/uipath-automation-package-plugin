package com.uipath.uipathpackage.models;

public class AssetsOptions extends AuthenticatedOptions {
    private String assetsFile;
    private final String origin = "Jenkins";

    public String getAssetsFile() {
        return assetsFile;
    }

    public void setAssetsFile(String assetsFile) {
        this.assetsFile = assetsFile;
    }

    public String getOrigin() {
        return origin;
    }
}
