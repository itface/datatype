
public class DataType {
    /**
     * 一、基本数据类型：
     *    1、数值型（a、整数型（byte 8位、short 16位、int 32位、long 64位）b、浮点型(float 32位、double 64位)）
     *    2、字符型 char
     *    3、布尔型 boolean
     * 二、引用类型数据:
     *     1、类
     *     2、接口
     *     3、数组   
     * 自动提升规则:
     *   1、byte short char的值自动提升到int型
     *   2、如果有一个操作数是long,结果就是long型
     *   3、如果有一个操作数是float，结果就是float型
     *   4、如果有一个操作数是double，结果就是double型    
     * @param args
     */
	public final static void main(String[] args){
		char a = 'a'; //16,只能一个字符
		char b = '你'; //16,只能一个字符
		byte c = 'a'; //8,只能一个字节
		short x = 'b';//16
		short d =99; //16
		int e =99; //32
		long f = 99; //64
		float g=99;//单精度浮点型 32位
		double h=99;//双精度浮点型 64位
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
