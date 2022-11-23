class CricketFact{
  
  
     static String topBatsmen[] = {"ROHIT SHARMA","MARTIN GUPTILL","V SEEHWAG","CHRIS GAYLE","SACHIN TENDDULKAR","VIRAT KOHLI"};
	 static int highestScores[] = {264,237,219,215,200,183};
	 static String topBowlers[] = {"M Muralidaran","Wasim Akram","Waqar Younis","Shahid Afridi","Anil Kumble"};
	 static int highestWickets[] = {534,502,416,395,337};
	 static String topTeam[] = {"AUSTRALIA","INDIA","WEST INDIES","PAKISTAN","ENGLAND"};
	 static int worldCup[] = {5,2,2,1,1};
	 
	 public static void main(String cricket[]){
		 
	 getTopBatsmen();
	 getHighestScores();
	 getTopBowlers();
	 getHighestWickets();
	 getTopTeam();
	 getWorldCup();
	 }
	 
	 
	 
	 public static void getTopBatsmen(){
	
	 System.out.println("LENGTH OF TOP BATSMEN");
	 System.out.println(topBatsmen.length);
	 System.out.println("BEST ODI BATSMEN");
	 for(int a = 0 ; a < topBatsmen.length ; a++)
	 {
	 System.out.println(topBatsmen[a]);	 
	 }
	 }
	 
	 
	 
	 public static void getHighestScores(){
	
     System.out.println("LENGTH OF HIGHEST SCORE");
	 System.out.println(highestScores.length);
	 System.out.println("HIGHEST SCORE OF TOP ODI BATSMEN");
	 for(int  b = 0 ; b < topBatsmen.length ; b++)
	 {
	 System.out.println(highestScores[b]);	 
	 }
	 }
	 
	 
	 
	 public static void getTopBowlers(){
	
     System.out .println("LENGTH OF TOP BOWLERS");	
	 System.out.println(topBowlers.length);
	 System.out.println("BEST ODI BOWLERS");
	 for(int  c = 0 ; c < topBowlers.length ; c++)
	 {
	 System.out.println(topBowlers[c]);	 
	 }
	 }
	 
	 
	 
	 public static void getHighestWickets(){
	
     System.out .println("LENGTH OF HIGHEST WICKETS");	
	 System.out.println(highestWickets.length);
	 System.out.println("BEST ODI BOWLERS");
	 for(int  d = 0 ; d < highestWickets.length ; d++)
	 {
	 System.out.println(highestWickets[d]);	 
	 }	
	 }
	 
	 
	 
	 public static void getTopTeam(){
	
     System.out .println("LENGTH OF TOP TEAMS");	
	 System.out.println(topTeam.length);	
	 System.out.println("BEST ODI TEAMS");
	 for(int  e = 0 ; e < topTeam.length ; e++)
	 {
	 System.out.println(topTeam[e]);	 
	 }	
	 }
	 
	 
	 
	 public static void getWorldCup(){
	
     System.out .println("LENGTH OF WORLD CUP");	
	 System.out.println(worldCup.length);	
	 System.out.println("TEAMS WITH HIGHEST NUMBER OF ODI WORLD CUP");
	 for(int  f = 0 ; f < worldCup.length ; f++)
	 {
	 System.out.println(worldCup[f]);	 
	 }			 
	 }
	 
	 }