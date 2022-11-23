class DisneyHotstar{
  
  
     static String popularReality[] = {"BIGG BOSS TELUGU","BIGG BOSS TAMIL","BOMBAT BOJANA","MASTER CHEF INDIA","THE KARDASHIANS","SUPER STARS","BIGG BOSS MALAYALAM","DANCE PLUS","MASTER CHEF AUSTRALIA","GORDAN RAMSAY","THE VOICE"};
	 static String popularCrime[] = {"SISTERHOOD","WHITE COLLAR","OOZHAM","NIRBHAYA","CRIMINAL JUSTICE","RAID","BUSINESSMAN","THE KINGSMAN","CADAVER","RUDRA"};
	 static String popularComedy[] = {"SHINCHAN","MODERN FAMILY","THOR","PATAKI","CHAI TIME","SON OF ABISH","COMEDY GANG","FAMILY GUY","HOUSEFULL","FREE GUY"};
	 static String popularBiopic[] = {"SUPER 30","MS DHONI","MIKE","83","ATTAHASA","FORD V FERRARI","RISE","THE DROPOUT","SANJU","NEERJA"};
	 static String popularScience[] = {"SCIENCE OF STUPID","COSMOS","SUPERSTRUCTURE","ULTIMATE SUPERCARS","MADE IN A DAY","BRAIN GAMES","HUBBLE","APOLLO","MEGAFACTORY","MISSION PLUTO"};
	 
	 public static void main(String plus[]){
		 
	 getPopularReality();
	 getPopularCrime();
	 getPopularComedy();
	 getPopularBiopic();
	 getPopularScience();
	 
	 }
	 
	 
	 
	 public static void getPopularReality(){
		 
	 System.out.println("LENGTH OF POPULAR REALITY SHOWS");
	 System.out.println(popularReality.length);
	 System.out.println("POPULAR REALITY SHOWS IN DISNEY PLUS HOTSTAR");
	 for(int i = 0 ; i < popularReality.length ; i++)
	 {
	 System.out.println(popularReality[i]);	 
	 }
	 System.out.println("===============================================================================");
	 }
	 
	 
	 public static void getPopularCrime(){
		 
	 System.out.println("LENGTH OF POPULAR CRIME SHOWS");
	 System.out.println(popularCrime.length);
	 System.out.println("POPULAR CRIME SHOWS IN DISNEY PLUS HOTSTAR");
	 for(int j = 0 ; j < popularCrime.length ; j++)
	 {
	 System.out.println(popularCrime[j]); 
	 }
	 System.out.println("==============================================================================");
	 }
	 
	 
	 
	 public static void getPopularComedy(){
		 
     System.out.println("LENGTH OF POPULAR COMEDY SHOWS");
	 System.out.println(popularComedy.length);
	 System.out.println("POPULAR COMEDY SHOWS IN DISNEY PLUS HOTSTAR");
	 for(int k = 0 ; k < popularComedy.length ; k++)
	 {
	 System.out.println(popularComedy[k]); 
	 }
	 System.out.println("=============================================================================");
	 }
	 
	 
	 
	 public static void getPopularBiopic(){
		  
	 System.out.println("LENGTH OF POPULAR BIOPIC SHOWS");
	 System.out.println(popularBiopic.length);
	 System.out.println("POPULAR BIOPICS IN DISNEY PLUS HOTSTAR");
	 for(int l = 0 ; l < popularBiopic.length ; l++)
	 {
	 System.out.println(popularBiopic[l]);	 
	 }
     System.out.println("==============================================================================");	  
	 }
	 
	 
	 
	 
	 public static void getPopularScience(){
		 
     System.out.println("LENGTH OF POPULAR SCIENCE SHOWS");
	 System.out.println(popularScience.length);
	 System.out.println("POPULAR SCIENCE SHOWS IN DISNEY PLUS HOTSTAR");
	 for(int m = 0 ; m < popularScience.length ; m++)
	 {
	 System.out.println(popularScience[m]);
	 }
	 }
	 
	 }