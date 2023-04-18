package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {

    private String name;

    private ArrayList<String> files;
    private String discType;

    public BaseDisc(String name, ArrayList<String> files, String discType) {
        this.name = name;
        this.files = files;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<String> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Override
    public String toString() {
        return
                "name'" + name + '\'' +
                        ", files=" + files +
                        ", discType='" + discType;
    }
}
