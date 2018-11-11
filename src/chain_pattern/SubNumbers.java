package chain_pattern;


public class SubNumbers implements chain
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
		if(requests.getCalculationWantwd()=="sub")
		{
			return requests.getNumber1()-requests.getNumber2();
		}
		else
		{
			return nextInChain.calculate(requests);
		}

	}
}