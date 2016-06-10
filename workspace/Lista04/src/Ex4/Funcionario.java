package Ex4;

public class Funcionario implements Programador, Gerente
{
	private String company;
	private String name;
	private double salary;
	private int workHours;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getWorkHours()
	{
		return workHours;
	}
	
	public boolean codedPerfectly ()
	{
		return true;
	}
	public boolean goodLeadership ()
	{
		return false;
	}
	static public void main (String args)
	{
		Programador p = new Funcionario();
		p.codedPerfectly();
		p.getSalary();
		Gerente g = new Funcionario();
		g.getWorkHours();
		g.goodLeadership();
		Funcionario f = new Funcionario();
		f.codedPerfectly();
		f.getSalary();
		f.getWorkHours();
		f.goodLeadership();
		// a classe funcionario tem todas as funções das interfaces que implementa,
		// mas as interfaces só tem as funções características da sua descrição.
	}
	
}
