package com.netcracker.vectors;

public class ArrayVector implements Vector, Cloneable {

    private double vctr[];
    private int vLength;

    public ArrayVector(int vl) {
        vLength = vl;
        vctr = new double[vLength];
    }
    
    public ArrayVector(double ... vl) {
        int length = vl.length;
        vctr = new double[length];
        try {
            for (int i = 0; i < length; i++) {
                setEl(i, vl[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void setEl(int numEl, double el) {
        try {
            vctr[numEl] = el;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public double getEl(int indx) {
        return vctr[indx];
    }

    @Override
    public int getLength() {
        return vLength;
    }

    @Override
    public void fillArray(double vs[]) {
        int length = vctr.length;
        try {
            for (int i = 0; i < length; i++) {
                vctr[i] = vs[i];
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public void fillClass(Vector vs) {
        int length = vctr.length;
        try {
            for (int i = 0; i < length; i++) {
                vctr[i] = vs.getEl(i);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }

    @Override
    public boolean compare(Vector vcomp) {
        int length = vctr.length;
        boolean compOne = false;
        double compTwo = 0;
        try {
            if (length == vcomp.getLength()) {
                compOne = true;
                for (int i = 0; i < length; i++) {
                    if (vctr[i] == vcomp.getEl(i)) {
                        compTwo++;
                    }
                }
            }
            if (compOne == true) {
                if (compTwo == length) {
                    return true;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    @Override
    public double minEl() {
        double min;
        min = getEl(0);
        try {
            for (int i = 0; i < vLength; i++) {
                if (getEl(i) < min) {
                    min = getEl(i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        return min;
    }

    @Override
    public double maxEl() {
        double max;
        max = getEl(0);
        try {
            for (int i = 0; i < vLength; i++) {
                if (getEl(i) > max) {
                    max = getEl(i);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        try {
            for (int i = 0; i < vLength; i++) {
                str = str.append(getEl(i)).append(" ");
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        String s = new String(str);
        return (s);
    }

    @Override
    public boolean equals(Object obj) {
        try {
            if (obj == null) {
                return false;
            } else {
                if (obj instanceof Vector) {
                    if (this.compare((Vector) obj)) {
                        return true;
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 0;
        try {
            for (int i = 0; i < vLength; i++) {
                long bits = Double.doubleToRawLongBits(this.getEl(i));
                result ^= ((int) (bits & 0x00000000FFFFFFFFL)) ^ ((int) ((bits & 0xFFFFFFFF00000000L) >> 32));
            }
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
        return result;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        ArrayVector res = (ArrayVector) super.clone();
        res.vctr = this.vctr.clone();
        return res;
    }

    public void printVector() {
        for (int i = 0; i < vLength; i++) {
            System.out.print(getEl(i) + " ");
        }
        System.out.println();
    }
}
