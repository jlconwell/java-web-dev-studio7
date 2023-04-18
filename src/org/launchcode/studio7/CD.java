package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc{

    private final double maximumData;
    public CD(String name, ArrayList<String> files, String discType) {
        super(name, files, discType);
        this.maximumData = 700;
    }

    @Override
    public void spin() {
        System.out.println("CD type of disc spins at 1.3 m/s.");
    }

    @Override
    public void storeData() {
        System.out.println("CD has maximum storage type 700MB.");
    }

    @Override
    public void writeByLaser() {
        System.out.println("CD writes by semiconductor laser at a fixed wavelength of 780nm.");

    }

    @Override
    public void readByLaser() {
        System.out.println("CD is read by semiconductor laser.");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
