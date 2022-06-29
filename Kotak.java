class Kotak extends Bank{
	@Override
public void getInterest(double interest)
{
interest = interest + 1.9;

super.getInterest(interest);

}
}