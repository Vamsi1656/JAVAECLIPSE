package com.interfaces;

public class User {

	public static void main(String[] args) {
		
		Oneplus oneplus=new Oneplus();
		
		oneplus.google();
		oneplus.calculator();
		oneplus.messaging();
		oneplus.gaming();
		
        RedMi redmi=new RedMi();
        
        redmi.google();
        redmi.calculator();
        redmi.messaging();
        redmi.Heating();
        
        Samsung samsung = new Samsung();
        
        samsung.google();
        samsung.calculator();
        samsung.messaging();
        samsung.camera();

	}

}
