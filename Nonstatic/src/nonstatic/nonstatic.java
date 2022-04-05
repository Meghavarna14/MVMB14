package nonstatic;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class nonstatic {
int a=10;
{
	System.out.println("non-static multiline initializer got executed!");
}
public void demoNonStaticMethod() {
	System.out.println("demoNonStaticMethod() non-static method got executed!");
}
	public static void main(String[] args) {
		
System.out.println("main(String[] args) method got executed!"); 
System.out.println("Now I'am creating an object--");
nonstatic nonstatic=new nonstatic();
System.out.println("End!");
	}

}
