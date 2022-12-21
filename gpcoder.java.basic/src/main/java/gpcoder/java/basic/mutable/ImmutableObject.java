package gpcoder.java.basic.mutable;

public class ImmutableObject {
	private String name;

	public ImmutableObject(String name) {
		super();
		this.name = name;
	}

	public ImmutableObject() {
		super();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ImmutableObject [name=" + name + "]";
	}

}
