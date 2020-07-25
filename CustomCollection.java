package list;
import java.util.Arrays;

public class CustomCollection<B> {
	private Object[] a;
	private static int stor=10;
	private int s=0;
	public CustomCollection() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	public CustomCollection(int capacity) {
		if(capacity>0)
			a=new Object[capacity];
		else if(stor==0)
			a=new Object[stor];
		else
			throw new IllegalArgumentException("Invalid capacity:"+capacity);
	}
	public void add(B f) {
		checkcapacity();
		a[s++]=f;
	}
	public void checkcapacity() {
		// TODO Auto-generated method stub
		if(a.length<=s) {
			int old=a.length;
			int newval=old*2;
			a=Arrays.copyOf(a, newval);
		}
	}
	public B get(int idx) {
		if(idx>=s) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		return(B)x[idx];
	}
	public B remove(int idx) {
		if(idx>=s-1) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		B old=(B)a[idx];
		int num=s-idx-1;
		if(num>0)
			System.arraycopy(a,idx+1, a, idx, num);
		a[--s]=null;
		return old;
	}
	public void print() {
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	}
}