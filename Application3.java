class Mother 
{
    void show() 
{
        System.out.println("HelloMother");
    }
}

class Child extends Mother 
{
    void show() 
{
        System.out.println("HelloChild");
    }
}

class Application3
 {
    public static void main(String[] args) 
{
        Mother m1 = new Child();
        m1.show();
    }
}
