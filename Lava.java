package com.animals;

public record Lava (String name, double width, double inch, int ram) {
		Lava() {
		this("iphone",12.35,15,128); }
		public static void main(String args[]) {
		Lava p=new Lava("iphone",12.35,15,128);
		System.out.println(p);}}
		record Mobile(int model, String name, int price) {
		Mobile() {
		this(101,"iphone",150000); }
		public static void main(String args[]) {
			Mobile s=new Mobile(11,"china made",17500);
			Mobile s1=new Mobile(12,"max",15500);
			Mobile s2=new Mobile(13,"nokia",18500);
			Mobile s3=new Mobile(14,"samsung",21500);
			Mobile s4=new Mobile(15,"micromax",19500);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		}}


