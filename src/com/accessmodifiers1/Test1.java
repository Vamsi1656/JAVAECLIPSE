package com.accessmodifiers1;
import com.accessmodifiers.*;
public class Test1 extends Test {

	public static void main(String[] args) {
		Test t1=new Test();
//		t1.wish();  Not visible because it is private
//		t1.demo();  Not visible because it is protected only access inside the package.
//		t1.test();  Not visible because it is default access only inside the package.
        System.out.println(t1.a);
        Test1 t2=new Test1();
        t2.demo(); // We use protected outside the package using child reference.
        
	}

}
