package mediatheque;

public class PrintBooks implements ItemVisitor {
	public PrintBooks() {
	}

public void visit (Book item){
    System.out.println(item.toString());
}

public void visit (CD item){
}
}