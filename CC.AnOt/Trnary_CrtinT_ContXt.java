package CC.AnOt;

public class Trnary_CrtinT_ContXt
{
	public String I,N,Q;
		public void Set(
			String I,
			String N,
			String Q)
		{
			this.I=I;
			this.N=N;
			this.Q=Q;
		}

	public String IA(String A)
	{return I+A;}
	public String NA(String A)
	{return N+A;}
	public String QA(String A)
	{return Q+A;}

	public Trnary_CrtinT_ContXt(
		String I,
		String N,
		String Q)
	{Set(I,N,Q);}

	public static final Trnary_CrtinT_ContXt
		SNtnc_Nd=new Trnary_CrtinT_ContXt(".","?","!"),
		SNtnc_Nd_=new Trnary_CrtinT_ContXt("I","Q","N");
}