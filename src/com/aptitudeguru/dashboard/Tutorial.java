package com.aptitudeguru.dashboard;

public class Tutorial {

	

    int _tutorialid;
    String _tutorialques;
    String _tutorialcat;
 
     
 
    public Tutorial(){
         
    }
   
    public Tutorial(int tutorialid,String tutorialcat, String tutorialques){
        this._tutorialid = tutorialid;
        this._tutorialques = tutorialques;
       this._tutorialcat=tutorialcat;
        
    }
    public Tutorial( String tutorialcat, String tutorialques){
        
        this._tutorialques = tutorialques;
      this._tutorialcat=tutorialcat;
        
    }
     
  
    public int getID(){
        return this._tutorialid;
    }
     
    
    public void setID(int tutorialid){
        this._tutorialid = tutorialid;
    }
     
   
    public String getQues(){
        return this._tutorialques;
    }
     
    
    public void setQues(String tutorialques){
        this._tutorialques = tutorialques;
    }
    
   
   public String getCat(){
        return this._tutorialcat;
    }
     
   
    public void setCat(String tutorialcat){
        this._tutorialcat = tutorialcat;
    }
     
    
    
	

}
