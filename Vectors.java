package com.netcracker.vectors;

import java.util.Random;
import java.io.*;

public class Vectors {

    public static Vector multiplication(Vector mVec, double num) {
        Vector mResult = new ArrayVector((int) mVec.getLength());
        double length = mVec.getLength();
        for (int i = 0; i < length; i++) {
            mResult.setEl(i, (mVec.getEl(i) * num));
        }
        return mResult;
    }

    public static Vector summ(Vector vs1, Vector vs2) {
        Vector sResult = new ArrayVector((int) vs1.getLength());
        double length = vs1.getLength();
        for (int i = 0; i < length; i++) {
            sResult.setEl(i, (vs1.getEl(i) + vs2.getEl(i)));
        }
        return sResult;
    }

    public static Vector sort(Vector vs) {
        Vector sortResult = new ArrayVector((int) vs.getLength());
        double minvs, maxvs;
        double length = vs.getLength();
        sortResult.fillClass(vs);
        for (int i = 0; i < length; i++) {
            sortResult.setEl(i, vs.getEl(i));
        }
        maxvs = vs.maxEl();
        for (int i = 0; i < length; i++) {
            minvs = sortResult.getEl(i);
            for (int j = 0; j < length; j++) {
                if (sortResult.getEl(j) < minvs) {
                    minvs = sortResult.getEl(j);
                }
            }
            for (int j = 0; j < vs.getLength(); j++) {
                if (sortResult.getEl(j) == minvs) {
                    sortResult.setEl(j, maxvs);
                }
            }
            sortResult.setEl(i, minvs);
        }
        return sortResult;
    }

    public static Vector random(int length) {
        Vector vectorRandom = new ArrayVector(length);
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            vectorRandom.setEl(i, r.nextDouble());
        }
        return vectorRandom;
    }

    public static void outputVector(Vector v, OutputStream out) {
        try {
            int length = v.getLength();
            DataOutputStream outVec = new DataOutputStream(out);
            outVec.writeInt(length);
            for (int i = 0; i < length; i++) {
                outVec.writeDouble(v.getEl(i));
            }
            outVec.flush();
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }

    public static Vector inputVector(InputStream in) {
        Vector vector = null;
        try {
            DataInputStream inpVec = new DataInputStream(in);
            int length = inpVec.readInt();
            vector = new ArrayVector(length);
            for (int i = 0; i < length; i++) {
                vector.setEl(i, inpVec.readDouble());
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return vector;
    }

    public static void writeVector(Vector v, Writer out) {
        double length = v.getLength();
        PrintWriter outVec = new PrintWriter(out);
        outVec.print(length);
        for (int i = 0; i < length; i++) {
            outVec.print(" " + v.getEl(i));
        }
        outVec.flush();
    }

    public static Vector readVector(Reader in) {
        Vector vector = null;
        try {
            StreamTokenizer inpVec = new StreamTokenizer(in);
            int length = (int) inpVec.nval;
            inpVec.nextToken();
            vector = new ArrayVector(length);
            for (int i = 0; i < length; i++) {
                inpVec.nextToken();
                vector.setEl(i, inpVec.nval);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
        return vector;
    }
}

