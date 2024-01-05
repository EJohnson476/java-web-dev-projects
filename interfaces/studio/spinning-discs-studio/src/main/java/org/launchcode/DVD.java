package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    @Override
    public void spinDisc()
    {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    public DVD(int spinSpeed, String name, Double capacity, String discType)
    {
        super(spinSpeed,name,capacity,discType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
