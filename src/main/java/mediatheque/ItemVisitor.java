package mediatheque;

public interface ItemVisitor {
        // Une méthode pour chaque sous-classe de Item
	void visit(Book modem);
	void visit(CD modem);
}