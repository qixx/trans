/**
 * 
 */
package transports;

/**
 * @author lenovo
 *�ɻ��������������ֱ�800km/h,250km/h,120km/h
 */
abstract class transport
{
	protected String fname;
	protected String dname;
	protected double dis;
	abstract public double time();
	public transport() {}
	public double shows()
	{
		return time();
	}
	//public transport()
	//{
		
	//}
}
