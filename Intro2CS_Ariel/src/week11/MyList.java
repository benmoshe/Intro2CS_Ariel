package week11;

public class MyList implements MyListInterface{

	private Link _first;
	public MyList() {_first = null;}
	@Override
	public void add(String a) {
		Link f = new Link(a,_first);
	}

	@Override
	public void addLast(String a) {
		Link ll = new Link(a);
		if(this.isEmpty()) {_first = ll;}
		else {
			Link last = _first;
			for(int i=0;i<size()-1;i=i+1) {  // Bad Looking CODE!!!
				last = last.getNext();
			}
			last.setNext(ll);
		}
	}

	@Override
	public boolean remove(String a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(String a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get(int i) {
		String ans = null;
		if(size()>i) {
			Link t = _first;
			for(int a=0;a<i;a=a+1) {t=t.getNext();}
			ans = t.getData();
		}
		return ans;
	}

	@Override
	public boolean isEmpty() {
		return this.size()==0;
	}
	
	public int size() {
		int ans = 0;
		Link t = _first;
		while(t!=null) {
			ans=ans+1;
			t = t.getNext();
		}
		return ans;
	}

}
