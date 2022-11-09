package com.xworkz.block;

public class Block {


		public Block(){
			System.out.println(this.getClass().getSimpleName() + " " );
		}
		
		{
			System.out.println("block 1 is created");
		}	
		
		{
			System.out.println("block 2 is created ");
		}
		
		public static void  main(String a[]){
			System.out.println(" method is started");
			Block block = new Block();
			System.out.println("Method is ended");
		}
	}

