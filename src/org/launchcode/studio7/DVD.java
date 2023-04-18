package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc{

    private final double maxData;
    public DVD(String name, ArrayList<String> files, String discType) {
        super(name, files, discType);
        this.maxData = 15;
    }

    public void spin() {
        System.out.println("DVD spins at 11.080 Mbit/s.");

    }

    @Override
    public void storeData() {
        System.out.println("DVD stores a maximum of 15GB.");

    }

    @Override
    public void writeByLaser() {
        System.out.println("DVDs are written by blue lasers.");

    }

    @Override
    public void readByLaser() {
        System.out.println("DVDs are read by blue lasers.");

    }

    @Override
    public String toString() {
        return super.toString() +
                "Maximum Storage" + maxData +
                "GB";
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
