package bai8;

import java.util.Objects;

public class person {
	private String name;
    private String address;
	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		return Objects.equals(address, other.address) && Objects.equals(name, other.name);
	}
	public person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		String s="";
		s+=String.format("|%10s|%10s|", getName(), getAddress());
		return s;
	}
}
