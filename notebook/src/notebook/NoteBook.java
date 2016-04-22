package notebook;

import java.util.ArrayList;
import java.util.HashMap;

class Value{
	private int i;
	public void set(int i){
		this.i=i;
	}
	public int get(){
		return i;
	}
}
public class NoteBook {
	private ArrayList<String> notes=new ArrayList<String>();
//	private int size=0;
	public void add(String s)
	{
		notes.add(s);
	}
	
	public void add(String s,int location){
		notes.add(location,s);
	}
	
	public int getSize(){
		return notes.size();
	}
	
	public String getNote(int index){
		return notes.get(index);
	}
	
	public void removeNote(int index){
		notes.remove(index);
	}
	
	public String[] list(){
		String [] a=new String[notes.size()];
//		for(int i=0;i<notes.size();i++){
//			a[i]=notes.get(i);
//		}
		notes.toArray(a);
		return a;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//对象数组
		
//		int[] ia=new int[10];
//		for(int v:ia){
//			System.out.println(v);
//			v=1;
//		}
//		for(int v:ia){
//			System.out.println(v);
//		}
		
		
//		Value[] a=new Value[10];
//		for(int i=0;i<a.length;i++){
//			a[i]=new Value();
//			a[i].set(i);
//		}
//		for(Value v :a){
//			System.out.println(v.get());
//			v.set(0);
//		}
//		for(Value v:a){
//			System.out.println(v.get());
//		}
//		
//		int []ia=new int[10];
//		String []a=new String[10];
//		System.out.println(ia[0]+2);
////		System.out.println(a[0].length());
//		
//		String s=null;
//		System.out.println(s.length());
////		
//		NoteBook nb=new NoteBook();
//		nb.add("first");
//		nb.add("second");
//		nb.add("Third",1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		System.out.println(nb.getNote(1));
//		
//		nb.removeNote(1);
//		String []a=nb.list();
//		for(String s : a){
//			System.out.println(s);
//		}
	}

}
