
public class DataType {
    /**
     * һ�������������ͣ�
     *    1����ֵ�ͣ�a�������ͣ�byte 8λ��short 16λ��int 32λ��long 64λ��b��������(float 32λ��double 64λ)��
     *    2���ַ��� char
     *    3�������� boolean
     * ����������������:
     *     1����
     *     2���ӿ�
     *     3������   
     * �Զ���������:
     *   1��byte short char��ֵ�Զ�������int��
     *   2�������һ����������long,�������long��
     *   3�������һ����������float���������float��
     *   4�������һ����������double���������double��    
     * @param args
     */
	public final static void main(String[] args){
		char a = 'a'; //16,ֻ��һ���ַ�
		char b = '��'; //16,ֻ��һ���ַ�
		byte c = 'a'; //8,ֻ��һ���ֽ�
		short x = 'b';//16
		short d =99; //16
		int e =99; //32
		long f = 99; //64
		float g=99;//�����ȸ����� 32λ
		double h=99;//˫���ȸ����� 64λ
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
