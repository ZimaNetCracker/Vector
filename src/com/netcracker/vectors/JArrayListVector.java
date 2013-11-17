package com.netcracker.vectors;

import java.util.*;

public class JArrayListVector implements Vector, Cloneable {
    
    private ArrayList <Double> vector;
    
    public JArrayListVector() {
        vector = new ArrayList<>();
    }
    
    public JArrayListVector(double ... arr) {
        this();
        for (int i = 0; i < arr.length; i++){
            vector.add(i, arr[i]);
        }
    }
    
    @Override
    public void setEl(int numEl, double el) {
        vector.set(numEl, el);
    }

    @Override
    public double getEl(int indx) {
        return vector.get(indx);
    }
    
    @Override
    public int getLength() {
        return vector.size();
    }

    @Override
    public void fillArray(double vs[]) {
        int length = vs.length;
        for (int i = 0; i < length; i++) {
            vector.add(i, vs[i]);
        }
    }

    @Override
    public void fillClass(Vector vs) {
        for (int i = 0; i < vs.getLength(); i++) {
            vector.add(i, vs.getEl(i));
        }
    }

    @Override
    public boolean compare(Vector vcomp) {
        boolean compOne = false;
        double compTwo = 0;
        if (vector.size() == vcomp.getLength()) {
            compOne = true;
            for (int i = 0; i < vector.size(); i++) {
                if (vector.get(i) == vcomp.getEl(i)) {
                    compTwo++;
                }
            }
        }
        if (compOne == true) {
            if (compTwo == vector.size()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double minEl() {
        double min;
        min = vector.get(0);
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) < min) {
                min = vector.get(i);
            }
        }
        return min;
    }

    @Override
    public double maxEl() {
        double max;
        max = vector.get(0);
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) > max) {
                max = vector.get(i);
            }
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < vector.size(); i++) {
            str = str.append(vector.get(i)).append(" ");
        }
        String s = new String(str);
        return (s);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Vector) {
                if (this.compare((Vector) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (int i = 0; i < this.getLength(); i++) {
            long bits = Double.doubleToRawLongBits(this.getEl(i));
            result ^= ((int) (bits & 0x00000000FFFFFFFFL)) ^ ((int) ((bits & 0xFFFFFFFF00000000L) >> 32));
        }
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        JArrayListVector result = null;
        try {
            result = (JArrayListVector) super.clone();
            result.vector = (ArrayList<Double>) this.vector.clone();
        } catch (CloneNotSupportedException e) {
        }
        return result;
    }
    
        public void printVector() {
            int length = vector.size();
            for (int i = 0; i < length; i++) {
                System.out.print(getEl(i) + " ");
            }
            System.out.println();
    }
}
