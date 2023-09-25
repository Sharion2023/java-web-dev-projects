package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(int spinRate, String discType, double storageCapacity) {
        super(spinRate, discType, storageCapacity);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storageCapacity() {
        System.out.println("You've printed the DVD with a storage capacity of " + this.getStorageCapacity());
    }

    @Override
    public void dataWritten() {

    }

    @Override
    public void dataRead() {

    }
    // TODO: Implement your custom interface.



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
