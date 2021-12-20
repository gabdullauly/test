package Classes;

public class Company {
    private String name;
    private Integer year;
    private Worker[] workers;

    public Company(){}
    public Company(String name, Integer year, Worker[] workers) {
        this.name = name;
        this.year = year;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }
}
