package Classes;

public class Main {
    public static void main(String[] args) {
        Worker worker1=new Worker();
        worker1.setId(0);
        worker1.setName("Marat");
        worker1.setSalary(100000);

        Worker worker2=new Worker(1,"Temirlan",200000);
        Worker worker3=new Worker(2,"Tima",300000);
        Worker[]workers={worker1,worker2,worker3};

        Company company=new Company();
        company.setName("Kaspi KZ");
        company.setYear(2000);
        company.setWorkers(workers);

        System.out.println(company.getName()+" "+company.getYear());

        int sum=0;
        System.out.println("_____________________");
        for (int i=0; i<company.getWorkers().length; i++){
            System.out.println(company.getWorkers()[i].getId()+" "+company.getWorkers()[i].getName()
                    +" "+company.getWorkers()[i].getSalary());
            sum=sum+company.getWorkers()[i].getSalary();
        }

        System.out.println("Общая зарплата сотрудников:"+sum);
    }
}
