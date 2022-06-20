package controllers;

import models.Conversor;

public class presenter {
	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		System.out.println(conversor.conversor("-7C.245", 15, 16, 12));
	}
}
