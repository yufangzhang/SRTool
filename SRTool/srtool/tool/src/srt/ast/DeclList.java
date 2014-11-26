package srt.ast;

import java.util.List;

public class DeclList extends Node {

	public DeclList(Decl[] decls) {
		this(decls, null);
	}
	
	public DeclList(Decl[] decls, NodeInfo nodeInfo) {
		super(nodeInfo);
		for(Decl decl : decls) {
			children.add(decl);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Decl> getDecls() {
		return (List<Decl>)children.clone();
	}

}
