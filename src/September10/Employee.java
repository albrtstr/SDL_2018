/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September10;

/**
 *
 * @author basisb20
 */
public class Employee implements Comparable{
    private String nama;
    private int salary;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
    public Employee (String nama, int salary){
        this.nama = nama;
        this.salary = salary;
    }
    @Override
    public int compareTo (Object o){
        Employee emp = (Employee) o;
        if (salary < emp.salary) {
            return 1;
        } else if (salary > emp.salary){
            return -1;
        }
        
        return 0;
    }
}
