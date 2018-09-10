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
public class Main {
    public static void main(String[] args) {
        Employee listKaryawan[] = new Employee [5];
        listKaryawan[0] = new Employee ("Agus",  3000000);
        listKaryawan[1] = new Employee ("Sigit", 3000000);
        listKaryawan[2] = new Employee ("Endah", 7000000);
        listKaryawan[3] = new Employee ("Gusti", 2000000);
        listKaryawan[4] = new Employee ("Selly", 5000000);
        
        Employee otherKaryawan = new Employee("Budi", 5000000);
        
        search(listKaryawan, otherKaryawan);
    }
    
    public static Employee search (Employee emp[], Employee otherEmp){
        Employee other = (Employee) otherEmp;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].compareTo(otherEmp) == 0) {
                System.out.println("Gaji " + otherEmp.getNama() + " sama dengan " + emp[i].getNama());
            }
        }
        return otherEmp;
    }
}
