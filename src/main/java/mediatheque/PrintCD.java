package mediatheque;

public class PrintCD implements ItemVisitor {
	public PrintCD() {
	}

public void visit (CD item){
    System.out.println(item.toString());
}

public void visit (Book item){
}
}
