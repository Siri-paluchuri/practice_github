class Employee
{
	String empId;
	String empName;
	Address address;

public void setempId(String empId)
{
	this.empId=empId;
}
public String getempId()
{
	return empId;
}
public void setempName(String empName)
{
	this.empName=empName;
	System.out.println("siri");
}
public String getempName()
{
	return empName;
}
public void setaddress(Address address)
{
	this.address=address;
}
public Address getaddress()
{
	return address;
}
public String toString()
{
	return "Employee id: "+empId+"Employee Name: "+empName+address.toString();
}
}
class Address{
	String addr1;
	String addr2;
	String city;
	int pin;
	public void setaddr1(String addr1)
	{
		this.addr1=addr1;
	}
	public String getaddr1()
	{
		return addr1;
	}
	public void setaddr2(String addr2)
	{
		this.addr2=addr2;
	}
	public String getaddr2()
	{
		return addr2;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getcity()
	{
		return city;
	}
	public void setpin(int pin)
	{
		this.pin=pin;
	}
	public int getpin()
	{
		return pin;
	}
	public String toString()
	{
		return " Address line1:"+addr1+"Address line2:"+addr2+"City:"+city+"pincode:"+pin;
	}
}
public class EmployeeDemo {
	
	public static void storeDate(Employee e)
	{
		e.setempId("E12345");
		e.setempName("lily");
		Address a=new Address();
		a.setaddr1("235seetha");
		a.setaddr2("432Rama");
		a.setcity("hyd");
		a.setpin(508207);
		e.setaddress(a);
		
		
	}
	public static void showData(Employee e)
	{
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		storeData(e);
		showData(e);

	}
	
}/*
class Employee {
    String empId;
    String empName;
    Address address;

    public void setempId(String empId) {
        this.empId = empId;
    }

    public String getempId() { // Corrected getter method name from getemId to getempId
        return empId;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    public String getempName() {
        return empName;
    }

    public void setaddress(Address address) {
        this.address = address;
    }

    public Address getaddress() {
        return address;
    }

    public String toString() {
        return "Employee id: " + empId + " Employee Name: " + empName + " " + address.toString();
    }
}

class Address {
    String addr1;
    String addr2;
    String city;
    int pin;

    public void setaddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getaddr1() {
        return addr1;
    }

    public void setaddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getaddr2() {
        return addr2;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getcity() {
        return city;
    }

    public void setpin(int pin) {
        this.pin = pin;
    }

    public int getpin() {
        return pin;
    }

    public String toString() {
        return "Address line1: " + addr1 + " Address line2: " + addr2 + " City: " + city + " Pincode: " + pin;
    }
}

public class EmployeeDemo {

    public static void storeData(Employee e) { // Corrected method name from storeDate to storeData
        e.setempId("E12345");
        e.setempName("Lily");
        Address a = new Address();
        a.setaddr1("235 Seetha");
        a.setaddr2("432 Rama");
        a.setcity("Hyderabad");
        a.setpin(508207);
        e.setaddress(a);
    }

    public static void showData(Employee e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        storeData(e); // Corrected method call
        showData(e);
    }
}/*

