package collections.ArrayList.assignment;

public class Emp implements Comparable<Emp> {
    private int age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
     public String toString(){
        return "Age : "+age+" , Name : "+name+" , Salary : "+sal;
     }

     public boolean equals(Object o){
        Emp p = (Emp)o;
        if(this.age == p.age && this.name.equals(p.name) && this.sal==p.sal)
            return true;
        return false;
     }

    @Override
    public int compareTo(Emp o) {
        return this.age-o.age;
    }
}
