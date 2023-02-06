public class Profile{
    private String name;
    private int age;
    private String gender;
    private String email;

    public Profile(String name, int age, String gender, String email){
      try{
      if(email.endsWith("gatech.edu")){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
      } else {
        throw new IllegalArgumentException();

      }
    } catch{
        //do something to tell the user must be gatech
    }
    }
    public String getName(){
        return this.name;
    }


    public String getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

}