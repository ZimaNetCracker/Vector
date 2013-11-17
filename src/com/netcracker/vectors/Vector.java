package com.netcracker.vectors;

public interface Vector {

    public void setEl(int numEl, double el);

    public double getEl(int indx);

    public void fillArray(double vs[]);

    public void fillClass(Vector vs);

    public boolean compare(Vector vcomp);

    public int getLength();

    public double minEl();

    public double maxEl();
    
    @Override
    public String toString();
    
    @Override
    public boolean equals(Object obj);
    
    @Override
    public int hashCode();

}
