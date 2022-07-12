public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;
        if (salary < 1000) {
            tax = 0;
        } else {
            tax = (salary * 3) / 100;
        }
        return tax;
    }

    double bonus() {
        double bonus = 0.0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double raisesalary = 0;
        int yil = 2021 - hireYear;
        if (yil < 10) {
            raisesalary = (salary * 5) / 100;
        }
        if (yil > 9 && yil < 20){
            raisesalary = (salary * 10) / 100;
        }
        if(yil > 19){
            raisesalary = (salary * 15) / 100;
        }
        salary += raisesalary;
        return raisesalary;
    }
    void print(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma saati : " + this.workHours);
        System.out.println("Baslangic yili : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + ((this.salary + bonus()) -  tax()));
        System.out.println("Toplam maas : " + ((salary + bonus() + raiseSalary()) - tax()));
    }
}
