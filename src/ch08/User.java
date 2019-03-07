package ch08;

import java.io.Serializable;
import java.util.Comparator;

public class User<T extends Comparable & Cloneable & Comparator & Serializable> {
    private T name;
    private int age;
}
