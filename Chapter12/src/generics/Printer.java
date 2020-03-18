package generics;

public class Printer<T extends Material> {
	private T material;
	
	public String toString() {
		return material.toString();
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public void printing() {
		material.doprint();
	}
}
