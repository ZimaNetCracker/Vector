package com.netcracker.vectors;

import java.util.*;

public class JLinkedListVector implements Vector, Cloneable {
    
    private LinkedList<Double> vector;
   
    public JLinkedListVector(){
        vector = new LinkedList<>();
    }
    
    public JLinkedListVector(double ... list){
        this();
        int length = list.length;
        for (int i = 0; i < length; i++){
            vector.add(i, list[i]);
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
        int length = vs.getLength();
        for (int i = 0; i < length; i++) {
            vector.add(i, vs.getEl(i));
        }
    }

    @Override
    public boolean compare(Vector vcomp) {
        boolean compOne = false;
        double compTwo = 0;
        int length = this.getLength();
        if (length == vcomp.getLength()) {
            compOne = true;
            for (int i = 0; i < length; i++) {
                if (this.getEl(i) == vcomp.getEl(i)) {
                    compTwo++;
                }
            }
        }
        if (compOne == true) {
            if (compTwo == length) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double minEl() {
        double min;
        int length = vector.size();
        min = vector.get(0);
        for (int i = 0; i < length; i++) {
            if (vector.get(i) < min) {
                min = vector.get(i);
            }
        }
        return min;
    }

    @Override
    public double maxEl() {
        double max;
        int length = vector.size();
        max = vector.get(0);
        for (int i = 0; i < length; i++) {
            if (vector.get(i) > max) {
                max = vector.get(i);
            }
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int length = vector.size();
        for (int i = 0; i < length; i++) {
            str = str.append(vector.get(i)).append(" ");
        }
        String s = new String(str);
        return s;
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
        int length = vector.size();
        for (int i = 0; i < length; i++) {
            long bits = Double.doubleToRawLongBits(this.getEl(i));
            result ^= ((int) (bits & 0x00000000FFFFFFFFL)) ^ ((int) ((bits & 0xFFFFFFFF00000000L) >> 32));
        }
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        JLinkedListVector result = null;
        try {
            result = (JLinkedListVector) super.clone();
            result.vector = (LinkedList<Double>) this.vector.clone();
        } catch (CloneNotSupportedException e) {
        }
        return result;
    }
    
    public void printVector() {
        int length = this.getLength();
        for (int i = 0; i < length; i++) {
            System.out.print(this.getEl(i) + " ");
        }
        System.out.println();
    }
}
