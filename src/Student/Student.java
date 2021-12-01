 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author emper
 */
public class Student 
{
    private String Username;
    private String Password;
    private String Fname;
    private String Lname;
    private String Emal;
    private String Agie;
    private String Number;
    private String Sprt;
    private String Spcenter;
    private String Spbranch;
    private String Coach;
// in the same format add private String Coach with a capital C

public Student(String nusername, String npassword, String nfname, String nlname, String nemal, String nagie, String nnumber, String nsprt, String nspcenter, String nspbranch,String ncoach) //add String ncoach here after nspbranch
{
this.Username= nusername;
this.Password = npassword;
this.Fname= nfname;
this.Lname= nlname;
this.Emal= nemal;
this.Agie= nagie;
this.Number= nnumber;
this.Sprt = nsprt;
this.Spcenter= nspcenter;
this.Spbranch= nspbranch;
this.Coach=ncoach;
}
public Student()
{

}

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getEmal() {
        return Emal;
    }

    public String getAgie() {
        return Agie;
    }

    public String getNumber() {
        return Number;
    }

    public String getSprt() {
        return Sprt;
    }

    public String getSpcenter() {
        return Spcenter;
    }

    public String getSpbranch() {
        return Spbranch;
    }
    
     public String getCoach() {
        return Coach;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setEmal(String Emal) {
        this.Emal = Emal;
    }

    public void setAgie(String Agie) {
        this.Agie = Agie;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setSprt(String Sprt) {
        this.Sprt = Sprt;
    }

    public void setSpcenter(String Spcenter) {
        this.Spcenter = Spcenter;
    }

    public void setSpbranch(String Spbranch) {
        this.Spbranch = Spbranch;
    }

    
 
    public void setCoach(String Coach) {
        this.Coach = Coach;
    }




}