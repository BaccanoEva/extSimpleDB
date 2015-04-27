package simpledb.buffer;

import simpledb.file.Block;
import simpledb.server.SimpleDB;

public class MyBufferTester {


		public static void main(String[] args) 
			{
				String dirToCreateDB="akondDB"; 
				String fileName="simple.txt";
				int blkNum1 = 1; 
				int blkNum2 = 2 ;
	
				SimpleDB.initFileLogAndBufferMgr(dirToCreateDB);
				int numBuffs=10;
				/*
				BasicBufferMgr bufferManagerObj = new BasicBufferMgr(numBuffs);
				System.out.println("Buffer manager: " + bufferManagerObj.available());
				*/
				
				BufferMgr buffManagerObj =  new BufferMgr(numBuffs);
				Block blockObj1 =  new Block(fileName, blkNum1); 
				Block blockObj2 =  new Block(fileName, blkNum2);
				
				buffManagerObj.pin(blockObj1);
				System.out.println("The block # " + blockObj1.number() + "has buffer #" + buffManagerObj.containsMapping(blockObj1));
				System.out.println("The block # " + blockObj2.number() + "has buffer #" + buffManagerObj.containsMapping(blockObj2));
		
			}

	

}
