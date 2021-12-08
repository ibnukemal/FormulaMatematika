package com.sqa.main.ui;

import java.util.Scanner;

import com.sqa.main.formula.FormulaBangunRuang;

public class inputUI {
	FormulaBangunRuang formula;
	float sisi;
	
	
	public inputUI() {
		
		if(formula == null) {
			formula = new FormulaBangunRuang();
		}
	}
	
	public void showHitungLuasKotak() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan nilai untuk menghitung luas kotak");
		
		float sisi = scan.nextFloat();
		
		
		
		System.out.println("Nilai luas adalah : " + formula.hitungLuasKotak(sisi));
	}
	
}
