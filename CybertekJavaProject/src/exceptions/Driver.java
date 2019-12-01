package exceptions;

public class Driver {

    private String name;
    private int age;
    private String location;



    public void info(){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.trim().contains(" ")){
            throw new Exception("Multiple words are not allowed");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 || age < 120){
            throw new InvalidAgeException();
            //RuntimeException r = new RuntimeException();
            //throw r;
           ////// throw new RuntimeException("Invalid age entered: " + age);
        }
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws InvalidLocationException{
        if(location.length() < 3){
            throw new InvalidLocationException(location + " is invalid. Length is: " + location.length());
        }
        this.location = location;
    }
}
