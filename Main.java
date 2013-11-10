package com.netcracker.vectors;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        
    int vl = 5;
    int vlTwo = 7;
    ArrayVector arrayOne = new ArrayVector(vl);
    ArrayVector arrayFive = new ArrayVector(vlTwo);
    ArrayVector arraySeven = new ArrayVector(vl);
    ArrayVector arrayOneTwo = new ArrayVector(vl);
    
    arrayOneTwo.setEl(0, 11);
    arrayOneTwo.setEl(1, 22);
    arrayOneTwo.setEl(2, 33);
    arrayOneTwo.setEl(3, 44);
    arrayOneTwo.setEl(4, 55);

    double arrayFour[] = {1, 3, 5, 7, 9};
    double arraySix[] = {1, 3, 5, 7, 9, 11, 13};

    System.out.print ("clone: ");
//    arrayOne.fillArray(arrayFour);
    System.out.println(arrayOneTwo);
    ArrayVector clone = (ArrayVector) arrayOneTwo.clone();
    System.out.println(clone);
}

}
// привести все длины к int + 
// добавить методы equals, hashCode и clone в J классы +
// доделать сериализацию +
// всё протестировать
