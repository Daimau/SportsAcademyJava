/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminRecord;

public class Coach {
private String Coach_id;
private String Coach_name;
private String coach_date;
private String coach_phone;
private String coach_address;
private String sportlist;
private int hour_rate;
private String sportCenter;
private String sc;
 
 public Coach() {
    
 }
 
 public Coach(String c_id,String c_name,String c_date,String c_phone, String c_address,String c_sportlist,int c_hourrate,String c_sportCenter,String c_sc) {
    
   this.Coach_id=c_id;
   this.Coach_name=c_name;
   this.coach_date=c_date;
   this.coach_phone=c_phone;
   this.coach_address=c_address;
   this.sportlist=c_sportlist;
   this.hour_rate=c_hourrate;  
   this.sportCenter=c_sportCenter;
   this.sc=c_sc;     
     
 }

    
    public String getCoach_id() {
        return Coach_id;
    }

    
    public void setCoach_id(String Coach_id) {
        this.Coach_id = Coach_id;
    }

    
    public String getCoach_name() {
        return Coach_name;
    }

    
    public void setCoach_name(String Coach_name) {
        this.Coach_name = Coach_name;
    }

    
    public String getCoach_date() {
        return coach_date;
    }

   
    public void setCoach_date(String coach_date) {
        this.coach_date = coach_date;
    }

    
    public String getCoach_phone() {
        return coach_phone;
    }

    
    public void setCoach_phone(String coach_phone) {
        this.coach_phone = coach_phone;
    }

    
    public String getCoach_address() {
        return coach_address;
    }

    
    public void setCoach_address(String coach_address) {
        this.coach_address = coach_address;
    }

    
    public String getSportlist() {
        return sportlist;
    }

    
    public void setSportlist(String sportlist) {
        this.sportlist = sportlist;
    }

    
    public int getHour_rate() {
        return hour_rate;
    }

    
    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    
    public String getSportCenter() {
        return sportCenter;
    }

    
    public void setSportCenter(String sportCenter) {
        this.sportCenter = sportCenter;
    }

    
    public String getSc() {
        return sc;
    }

    
    public void setSc(String sc) {
        this.sc = sc;
    }
 
 
 
 
     
}
