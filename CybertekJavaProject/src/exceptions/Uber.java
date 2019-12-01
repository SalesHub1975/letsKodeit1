package exceptions;

public class Uber {

    public static void main(String[] args) throws Exception {

        Driver driver1 = new Driver();


        try {
            driver1.setName("James Bond");
            driver1.setAge(-25);
        }
        catch (InvalidAgeException e){
            System.out.println("catch for age");
        }
        catch (Exception e){
            System.out.println("catch for general");
        }

        try{
            driver1.setLocation("IL");
        }catch (InvalidLocationException e){
            System.out.println("Catch from location");
        }
        driver1.info();


    }
}
