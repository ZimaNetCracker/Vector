package com.netcracker.vectors;

import java.io.Serializable;

public class LinkedListVector implements Vector, Serializable {

    class ListVector {

        private double index;
        private double value;
        public ListVector next;
        public ListVector prev;

        public ListVector() {
            current = null;
            head = null;
            size = 0;
        }

        public ListVector(double value) {
            index = 0;
            this.value = value;
            next = null;
            prev = null;
        }

        public ListVector(double index, double value) {
            this.index = index;
            this.value = value;
            next = null;
            prev = null;
        }

        public void setIndex(double i) {
            this.index = i;
        }

        public double getIndex() {
            return index;
        }

        public void setEl(double value) {
            this.value = value;
        }

        public double getEl() {
            return value;
        }

        public void setPrev(ListVector prev) {
            this.prev = prev;
        }

        public ListVector getPrev() {
            return prev;
        }

        public void setNext(ListVector next) {
            this.next = next;
        }

        public ListVector getNext() {
            return next;
        }
    }
    
    private ListVector current;
    private ListVector head;
    private int size;

    private LinkedListVector() {
        current = null;
        head = null;
        size = 0;
    }

    public LinkedListVector(int length) {
        ListVector temp;
        for (int i = 0; i < length; i++) {
            temp = new ListVector(0);
            this.newEl(temp);
        }
    }

    public LinkedListVector(double... value) {
        this(value.length);
        for (int i = 0; i < value.length; i++) {
            current.setEl(value[i]);
            nextEl();
        }
    }

    private void newEl(ListVector newEl) {
        if (head == null) {
            head = newEl;
            current = newEl;
            current.setIndex(size);
            current.setNext(current);
            current.setPrev(current);
        } else {
            size++;
            newEl.setIndex(size);
            newEl.setNext(current.getNext());
            current.setNext(newEl);
            current = newEl;
        }
    }

    private void prevEl() {
        if (current.getPrev() != null) {
            ListVector temp = current;
            current = current.getPrev();
            current.setNext(temp);
        }
    }

    private void nextEl() {
        if (current.getNext() != null) {
            ListVector temp = current;
            current = current.getNext();
            current.setPrev(temp);
        } else {
            current.next = head;
        }
    }

    public ListVector getCurrent() {
        return current;
    }

    public ListVector getHead() {
        return head;
    }

    @Override
    public int getLength() {
        return size + 1;
    }

    @Override
    public void setEl(int numEl, double el) {
        while (current.getIndex() != numEl) {
            nextEl();
        }
        current.setEl(el);
    }

    @Override
    public double getEl(int numEl) {
        while (current.getIndex() != numEl) {
            nextEl();
        }
        return current.getEl();
    }

    public void addEl(double value) {
        ListVector el = new ListVector(value);
        this.newEl(el);
    }

    public void delEl() {
        ListVector temp = current;
        current = current.getPrev();
        current.setNext(temp.getNext());
        size--;
    }

    @Override
    public void fillArray(double vs[]) {
        if (this.getLength() != vs.length) {
            System.out.println("Передаваемый массив не равен по длине вектору");
        } else {
            for (int i = 0; i < vs.length; i++) {
                this.setEl(i, vs[i]);
            }
        }
    }

    @Override
    public void fillClass(Vector vs) {
        if (this.getLength() != vs.getLength()) {
            System.out.println("Передаваемый вектор не равен по длине вектору");
        } else {
            for (int i = 0; i < vs.getLength(); i++) {
                this.setEl(i, vs.getEl(i));
            }
        }
    }

    @Override
    public boolean compare(Vector vcomp) {
        boolean compOne = false;
        double compTwo = 0;
        if (this.getLength() == vcomp.getLength()) {
            compOne = true;
            for (int i = 0; i < this.getLength(); i++) {
                if (this.getEl(i) == vcomp.getEl(i)) {
                    compTwo++;
                }
            }
        }
        if (compOne == true) {
            if (compTwo == this.getLength()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double minEl() {
        double min;
        min = this.getEl(0);
        for (int i = 0; i < this.getLength(); i++) {
            if (this.getEl(i) < min) {
                min = this.getEl(i);
            }
        }
        return min;
    }

    @Override
    public double maxEl() {
        double max;
        max = this.getEl(0);
        for (int i = 0; i < this.getLength(); i++) {
            if (getEl(i) > max) {
                max = getEl(i);
            }
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.getLength(); i++) {
            str = str.append(getEl(i)).append(" ");
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
        for (int i = 0; i < size; i++) {
            long bits = Double.doubleToRawLongBits(this.getEl(i));
            result ^= ((int) (bits & 0x00000000FFFFFFFFL)) ^ ((int) ((bits & 0xFFFFFFFF00000000L) >> 32));
        }
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        LinkedListVector result = null;
        try {
            result = (LinkedListVector) super.clone();
            result.head = null;
            result.current = null;
            result.size = 0;
            for (int i = 0; i < this.getLength(); i++) {
                result.addEl(this.getEl(i));
            }
        } catch (CloneNotSupportedException e) {
        }
        return result;
    }
}
