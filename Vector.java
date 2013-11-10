package com.netcracker.vectors;

import java.io.Serializable;

public interface Vector extends Serializable{

    public void setEl(int numEl, double el);

    public double getEl(int indx);

    public void fillArray(double vs[]);

    public void fillClass(Vector vs);

    public boolean compare(Vector vcomp);

    public int getLength();

    public double minEl();

    public double maxEl();

}
