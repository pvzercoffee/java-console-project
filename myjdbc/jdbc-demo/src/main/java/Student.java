public class Student
{
    private String code;
    private String name;
    private int age;
    private String telephone;

    public Student(String code, String name, int age, String telephone)
    {
        this.code = code;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }
    public void setCode(String code)
    {
        this.code = code;
    }
    public String getCode()
    {
        return code;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getTelephone()
    {
        return telephone;
    }
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    public void print()
    {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Telephone: " + telephone);
        System.out.println("---------------------------");
    }
}