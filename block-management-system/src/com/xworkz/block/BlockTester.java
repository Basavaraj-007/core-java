package com.xworkz.block;

public class BlockTester {

	public BlockTester(){
		System.out.println(this.getClass().getSimpleName() + "object is ctreated " );
	}
	

static int blockInit;
static{
	System.out.println("block is executed");
	blockInit = 10 ;
}
 int blockInit1;{
	System.out.println(" block2 is excuted");
	blockInit1 = 20;
}
{
 System.out.println("instance block is created");	
}

public static void main(String[] args){
	System.out.println("main method started");
	BlockTester blockTester =  new BlockTester();
	
	//Block.m();
	
	System.out.println(BlockTester.blockInit);
	System.out.println(blockTester.blockInit1);
	System.out.println("main method ended");
	
}

}
