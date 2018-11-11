package JunitTest;


import static org.junit.Assert.assertEquals;

import chain_pattern.AddNumbers;
import chain_pattern.DivNumbers;
import chain_pattern.MulNumbers;
import chain_pattern.Numbers;
import chain_pattern.SubNumbers;
import chain_pattern.chain;


class CalculationsTestUnit
{
	
	void test() {
		chain chainCalc1 =  (chain) new AddNumbers();
		chain chainCalc2 = new SubNumbers();
		chain chainCalc3 = new MulNumbers();
		chain chainCalc4 = new DivNumbers();
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		//Numbers request = new Numbers(4,2,"add");
		assertEquals(6.0,chainCalc1.calculate(new Numbers(4,2,"add")),"");
		assertEquals(2.0,chainCalc1.calculate(new Numbers(4,2,"sub")),"");
		assertEquals(8.0,chainCalc1.calculate(new Numbers(4,2,"mul")),"");
		assertEquals(2.0,chainCalc1.calculate(new Numbers(4,2,"div")),"");


	}

	private void assertEquals(double expected, int calculate, String string) {
		// TODO Auto-generated method stub
		
	}
	
}