/**
 * 
 */
package transports;
import java.util.Scanner;
/**
 * @author lenovo
 *
 */
public class test
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		plane p1=new plane();
		train t1=new train();
		car c1=new car();
		Scanner reader=new Scanner (System.in);
		System.out.print("�����أ�");
		c1.fname=t1.fname=p1.fname=reader.next();
		System.out.print("��Ŀ�ĵأ�");
		c1.dname=t1.dname=p1.dname=reader.next();
		System.out.print(" ���룺");
		c1.dis=t1.dis=p1.dis=reader.nextDouble();
		System.out.print(" �ɻ�ʱ�䣺"+p1.shows()+" �ɻ�Ʊ��"+p1.money1());
		System.out.print(" ��ʱ�䣺"+t1.shows()+" ��Ʊ��"+t1.money2());
		System.out.print(" ����ʱ�䣺"+c1.shows()+" ����Ʊ��"+c1.money3());
	}

}
