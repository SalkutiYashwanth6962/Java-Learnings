
import java.util.List;
import java.util.Vector;

import java.util.*;


class Ipl {

   Team[] t=new Team[10];

    Ipl()
    { 
         t[0]=new Team("GT",20, new int[] {1,1,0,0,1});
         t[1]=new Team("LSG",18, new int[] {1,0,0,1,1});
         t[2]=new Team("RR",16, new int[] {1,0,1,0,0});
         t[3]=new Team("DC",14, new int[] {1,1,0,1,0});
         t[4]=new Team("RCB",14, new int[] {0,1,1,0,0});
         t[5]=new Team("KKR",12, new int[] {0,1,1,0,1});
         t[6]=new Team("PBKS",12, new int[] {0,1,0,1,0});
         t[7]=new Team("SRH",12, new int[] {1,0,0,0,0});
         t[8]=new Team("CSK",8, new int[] {0,0,1,0,1});
         t[9]=new Team("MI",6, new int[] {0,1,0,1,1});
    
    }
    
    
    
    List<Team> getFilteredTeams(int result ,int count)
    {
        
        List<Team> teams=new Vector<Team>();
        for(int i=0;i<10;i++) {
            
         boolean b= t[i].hasConsecutive(result,count);
         if (b)
         {
        
             teams.add(t[i]);
         }
        }    
         return teams;
    
    }



public double getAvgFilteredTeams(int result,int count)
{
    
    
    List<Team> teams=getFilteredTeams(result,count);
    
    double total=0;
    for(Team team:teams)
    {
        total+=team.getPoints();
    }
    
    double avg=total/teams.size();
    
    return avg;
}
}//class





//package revison;



 class Team {
    
    
    
String name;
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getPoints() {
    return points;
}
public void setPoints(int points) {
    this.points = points;
}
public int[] getResult() {
    return result;
}
public void setResult(int[] result) {
    this.result = result;
}
int points;
int result[];



Team()
{
}
Team(String name,int points,  int[] result)
{
this.name=name;
this.points=points;
this.result=result;
}
boolean hasConsecutive(int r,int n)
{
    int count =0;
    for(int i=0;i<5;i++) {
        if(result[i]==r) {
            count++;
            
        }
        else
        {
            count=0;
        }
        if(count==n) {
            return true;
        
    }
    
    }//for
     return false;        
    }//method





}//class



//package revison;






 class Cricket {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
       Ipl ipl=new Ipl();
       List<Team>  teams=ipl.getFilteredTeams(0,2);  //filterring on 2 consecutive loses
           if(teams.size()==0)
               System.out.println("no teams");
           else {
               for(Team team:teams)
                 System.out.println(team.getName());       
           }
           
       
           
           System.out.println("Average of Filtered Teams "+String.format("%,.2f", ipl.getAvgFilteredTeams(0,2))); // filterring on 2 consecutive loses
       
        
    }
 }