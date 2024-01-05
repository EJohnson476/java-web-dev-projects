package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    @Override
    public void spinDisc()
    {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }
    public CD(int spinSpeed, String name, Double capacity, String discType)
    {
        super(spinSpeed,name,capacity,discType);
    }
    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
