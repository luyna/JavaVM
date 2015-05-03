package zzm.chapter8;

/*
 * Java是静态类型语言
 */
public class StaticJava {
	public static void main(String[] args) {
		//可以通过编译，但是运行
		//java.lang.NegativeArraySizeException
		int[][][] arr = new int[1][0][-1];
	}

}
