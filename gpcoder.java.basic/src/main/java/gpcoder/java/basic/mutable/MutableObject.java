package gpcoder.java.basic.mutable;

public class MutableObject {
	private String name;

	public MutableObject(String name) {
		super();
		this.name = name;
	}

	public MutableObject() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MutableObject [name=" + name + "]";
	}

}
