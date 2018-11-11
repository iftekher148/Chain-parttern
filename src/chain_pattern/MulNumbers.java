package chain_pattern;


public class MulNumbers implements chain
{	
	private chain nextInChain;

	@Override
	public void setNextChain(chain nextChain)
	{
		this.nextInChain = nextChain;

	}

	@Override
	public int calculate(Numbers requests)
	{
		if(requests.getCalculationWantwd()=="multiply")
		{
			return requests.getNumber1()*requests.getNumber2();
		}
		else
		{
			return nextInChain.calculate(requests);
		}

	}
}