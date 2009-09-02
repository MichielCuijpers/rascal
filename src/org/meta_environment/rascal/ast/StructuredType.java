package org.meta_environment.rascal.ast; 
import org.eclipse.imp.pdb.facts.INode; 
public abstract class StructuredType extends AbstractAST { 
public org.meta_environment.rascal.ast.BasicType getBasic() { throw new UnsupportedOperationException(); }
	public java.util.List<org.meta_environment.rascal.ast.TypeArg> getArguments() { throw new UnsupportedOperationException(); }
public boolean hasBasic() { return false; }
	public boolean hasArguments() { return false; }
public boolean isDefault() { return false; }
static public class Default extends StructuredType {
/** basic:BasicType "[" arguments:{TypeArg ","}+ "]" -> StructuredType {cons("Default")} */
	private Default() {
		super();
	}
	public Default(INode node, org.meta_environment.rascal.ast.BasicType basic, java.util.List<org.meta_environment.rascal.ast.TypeArg> arguments) {
		this.node = node;
		this.basic = basic;
		this.arguments = arguments;
	}
	public <T> T accept(IASTVisitor<T> visitor) {
		return visitor.visitStructuredTypeDefault(this);
	}

	public boolean isDefault() { return true; }

	public boolean hasBasic() { return true; }
	public boolean hasArguments() { return true; }

private org.meta_environment.rascal.ast.BasicType basic;
	public org.meta_environment.rascal.ast.BasicType getBasic() { return basic; }
	private void $setBasic(org.meta_environment.rascal.ast.BasicType x) { this.basic = x; }
	public Default setBasic(org.meta_environment.rascal.ast.BasicType x) { 
		Default z = new Default();
 		z.$setBasic(x);
		return z;
	}
	private java.util.List<org.meta_environment.rascal.ast.TypeArg> arguments;
	public java.util.List<org.meta_environment.rascal.ast.TypeArg> getArguments() { return arguments; }
	private void $setArguments(java.util.List<org.meta_environment.rascal.ast.TypeArg> x) { this.arguments = x; }
	public Default setArguments(java.util.List<org.meta_environment.rascal.ast.TypeArg> x) { 
		Default z = new Default();
 		z.$setArguments(x);
		return z;
	}	
}
static public class Ambiguity extends StructuredType {
  private final java.util.List<org.meta_environment.rascal.ast.StructuredType> alternatives;
  public Ambiguity(INode node, java.util.List<org.meta_environment.rascal.ast.StructuredType> alternatives) {
	this.alternatives = java.util.Collections.unmodifiableList(alternatives);
         this.node = node;
  }
  public java.util.List<org.meta_environment.rascal.ast.StructuredType> getAlternatives() {
	return alternatives;
  }
  
  public <T> T accept(IASTVisitor<T> v) {
     return v.visitStructuredTypeAmbiguity(this);
  }
}
}